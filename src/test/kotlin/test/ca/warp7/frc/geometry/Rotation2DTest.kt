package test.ca.warp7.frc.geometry

import ca.warp7.frc.geometry.Rotation2D
import org.junit.jupiter.api.Test

//This is testing the Rotation2D class using unittesting

class Rotation2DTest {

//    @Test
//    fun unaryMinusWorksProperly() {
//        val rotateTest = Rotation2D(0.89, 0.55).unaryMinus()
//        val rotateGolden = Rotation2D(0.89, -0.55)
//        assert(rotateTest.epsilonEquals(rotateGolden))
//    }

    @Test
    fun epsilonEqualsWorksProperly(){
	val rotateNotEquals = Rotation2D(2.00000003, 2.99988882)
	val rotateEquals = Rotation2D(8.0 / 2.0, 12.0 / 4)
	val rotateTest = Rotation2D(2.0, 3.0)
	assert(!rotateTest.epsilonEquals(rotateNotEquals)
	assert(rotateTest.epsilonEquals(rotateEquals)
    }

    @Test
    fun plusWorksProperly(){
	val rotateAdd = Rotation2D(5.0, 4.0)
	val rotateTest = Rotation2D(2.0, 3.0).plus(rotateAdd)
	val rotateGolden = Rotation2D(-2.0, 23.0)
	assert(rotateTest == rotateGolden)
    }

    @Test
    fun minusWorksProperly(){
	val rotateMinus = Rotation2D(1.5, 2.0)
	val rotateTest = Rotation2D(3.0, 3.0).minus(rotateMinus)
	val rotateGolden = Rotation2D(10.5, 5.5)
	assert(rotateTest == rotateGolden) 
    }

    @Test
    fun scaledWorksProperly(){
	val rotateTest =  Rotation2D(2.4, -23.2).scaled(-2.0)
	val rotateGolden = Rotation2D(-4.8, 46.4)
	assert(rotateTest == rotateGolden)
    }

    @Test
    fun timesWorksProperly(){
	val rotateTest = Rotation2D(12.0, 2.0).times(3.0)
	val rotateGolden = Rotation2D(36.0, 6.0)
	assert(rotateTest == rotateGolden)
    }

    @Test
    fun divWorksProperly(){
	val rotateTest = Rotation2D(3.5, 2.4).div(2.0)
	val rotateGolden = Rotation2D(1.75, 1.2)
	assert(rotateTest == rotateGolden)
    }

    @Test
    fun inverseWorksProperly() {
        val rotateTest = Rotation2D(0.9, 0.05).inverse
        val rotateGolden = Rotation2D(0.9, -0.05)
        assert(rotateTest == rotateGolden)
    }
}
