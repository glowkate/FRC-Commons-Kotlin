package ca.warp7.frc.log

import java.io.PrintWriter

internal class CSVLoggerImpl(private val writer: PrintWriter) : CSVLogger {

    private var isDone = false
    private var count = 0

    override fun withHeaders(vararg headers: String): CSVLogger {
        writer.println(headers.joinToString(", "))
        writer.flush()
        return this
    }

    override fun writeData(vararg data: Number) {
        writer.println(data.joinToString(", "))
        count++
        if (count > 50) {
            writer.flush()
            count = 0
        }
    }

    override fun close() {
        if (!isDone) {
            isDone = true
            writer.close()
        }
    }
}