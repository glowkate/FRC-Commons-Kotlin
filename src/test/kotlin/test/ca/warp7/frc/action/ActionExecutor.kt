package test.ca.warp7.frc.action

import ca.warp7.frc.action.Action

fun executeUnrestricted(action: Action) {
    action.initialize()
    while (!action.shouldFinish) {
        action.update()
        Thread.sleep(20)
    }
    action.stop(false)
}