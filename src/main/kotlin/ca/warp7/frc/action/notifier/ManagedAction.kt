package ca.warp7.frc.action.notifier

import ca.warp7.frc.action.Action

internal class ManagedAction(val action: Action): Action {
    override val shouldFinish: Boolean
        get() = action.shouldFinish

}