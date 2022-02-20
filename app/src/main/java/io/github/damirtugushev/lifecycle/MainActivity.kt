package io.github.damirtugushev.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        const val NCREATE = "Activity CREATED"
        const val NSTART = "Activity STARTED"
        const val NRESUME = "Activity RESUME"
        const val NPAUSE = "Activity PAUSED"
        const val NSTOP = "Activity STOPPED"
        const val NRESTART = "Activity RESTARTED"
        const val NDESTROY = "Activity DESTROYED"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, NCREATE, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, NSTART, Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.LEFT, 0, 0)
            show()
        }
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, NRESUME, Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.TOP, 0, 0)
            show()
        }
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, NPAUSE, Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.RIGHT, 0, 0)
            show()
        }
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, NSTOP, Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.CENTER, 0, 0)
            show()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, NRESTART, Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.FILL_HORIZONTAL, 0, 0)
            show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, NDESTROY, Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.FILL, 0, 0)
            show()
        }
    }
}
