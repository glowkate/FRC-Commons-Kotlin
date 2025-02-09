package ca.warp7.frc.drive

data class WheelState(val left: Double, val right: Double) {
    override fun toString(): String {
        return "(${"%.3f".format(left)}, ${"%.3f".format(right)})"
    }

    operator fun times(by: Double) = WheelState(left * by, right * by)

    operator fun div(by: Double) = times(1.0 / by)

    /**
     * Solves the forward kinematics of the drive train by converting the
     * speeds/accelerations of wheels on each side into linear and angular
     * speed/acceleration
     *
     * Equations:
     * v = (left + right) / 2
     * w = (right - left) / L
     *
     * for velocity, solves (m/s, m/s) into (m/s, rad/s)
     * for acceleration, solves (m/s^2, m/s^2) into (m/s^2, rad/s^2)
     *
     * @param wheelbaseRadius the wheelbase radius
     * @return the chassis state
     */
    fun solve(wheelbaseRadius: Double): ChassisState = ChassisState(
            linear = (left + right) / 2.0,
            angular = (right - left) / (2 * wheelbaseRadius)
    )
}