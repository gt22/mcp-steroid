package com.jonnyzzz.mcpSteroid.integration.arena

class DpaiaScenarioFromArg : DpaiaScenarioBaseTest() {
    override val instanceId = checkNotNull(System.getProperty("arena.test.instanceId")) {
        "Please specify arena.test.instanceId system property"
    }
}
