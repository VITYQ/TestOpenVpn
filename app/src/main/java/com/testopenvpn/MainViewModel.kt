package com.testopenvpn

import android.app.Activity
import android.content.Context
import android.net.VpnService
import androidx.lifecycle.ViewModel
import com.Certificate
import de.blinkt.openvpn.OpenVpnApi
import de.blinkt.openvpn.core.OpenVPNThread

class MainViewModel: ViewModel() {
    private val vpnThread = OpenVPNThread()

    fun turnOnVpn(context: Activity) {
        val intent = VpnService.prepare(context)
        if (intent != null) {
            context.startActivityForResult(intent, 14)
        }
        else {
            startVpn(context)
        }
    }

    fun startVpn(context: Activity) {
        OpenVpnApi.startVpn(context, Certificate.cert, "", "freeopenvpn", "277706556")
    }

    fun turnOffVpn() {
        try {
            vpnThread.stopProcess()
        } catch (_: Exception) {}
    }
}