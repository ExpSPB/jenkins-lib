package ru.pulsar.jenkins.library

class StepExecutor implements IStepExecutor {

    private steps

    StepExecutor(steps) {
        this.steps = steps
    }

    @Override
    boolean isUnix() {
        return steps.isUnix()
    }

    @Override
    int sh(String script, boolean returnStatus, String encoding) {
        steps.sh script: script, returnStatus: returnStatus, encoding: encoding
    }

    @Override
    int bat(String script, boolean returnStatus, String encoding) {
        steps.bat script: script, returnStatus: returnStatus, encoding: encoding
    }
}
