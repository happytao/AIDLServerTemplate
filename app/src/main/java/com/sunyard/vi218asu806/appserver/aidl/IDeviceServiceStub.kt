package com.sunyard.vi218asu806.appserver.aidl

import android.os.IBinder
import android.util.Log

object IDeviceServiceStub: IDeviceService.Stub() {
    private var TAG = IDeviceServiceStub.javaClass.name

    init {
        val iDeviceServiceStub = IDeviceServiceStub
    }

    override fun getBuzzer(): IBuzzer {
        TODO("Not yet implemented")
    }

    override fun getIInsertCardReader(): IInsertCardReader {
        TODO("Not yet implemented")
    }

    override fun getIMagCardReader(): IMagCardReader {
        TODO("Not yet implemented")
    }

    override fun getIPinPad(): IPinPad {
        TODO("Not yet implemented")
    }

    override fun getIRSA(): IRSA {
        TODO("Not yet implemented")
    }

    override fun getISerialPort(): ISerialPort {
        TODO("Not yet implemented")
    }

    override fun getSystemMagner(): ISystemManager {
        Log.e(TAG, "getSystemMagner!!")
        return object : ISystemManager.Stub() {
            override fun sysSetDataTime(str: ByteArray?): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetDataTime(str: ByteArray?): Int {
                TODO("Not yet implemented")
            }

            override fun sysReadSecurityChipSN(sn: ByteArray?): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetSecurityChipVersion(version: ByteArray?): Int {
                TODO("Not yet implemented")
            }

            override fun sysLedControl(index: Byte, mode: Byte): Int {
                TODO("Not yet implemented")
            }

            override fun sysWriteSN(sn: String?) {
                TODO("Not yet implemented")
            }

            override fun sysReadSN(): String {
                TODO("Not yet implemented")
            }

            override fun sysReadTamperRecord(record: ByteArray?): Int {
                TODO("Not yet implemented")
            }

            override fun SysClearTamperRecord(): Int {
                TODO("Not yet implemented")
            }

            override fun sysSetScreenOffTimeout(time: Int): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetScreenOffTimeout(): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetScreenBrightness(): Int {
                TODO("Not yet implemented")
            }

            override fun sysSetScreenBrightness(value: Int): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetScreenBrightnessMode(): Int {
                TODO("Not yet implemented")
            }

            override fun sysSetScreenBrightnessMode(mode: Boolean): Int {
                TODO("Not yet implemented")
            }

            override fun sysSetDebugSecurityChipMode(mode: Boolean): Int {
                TODO("Not yet implemented")
            }

            override fun sysUartRecv(
                ComID: Char,
                strBuf: ByteArray?,
                p_read_len: IntArray?,
                timeout: Int,
                nbyte: Int
            ): Int {
                TODO("Not yet implemented")
            }

            override fun sysUartSend(ComID: Char, strBuf: ByteArray?, nByte: Int): Int {
                TODO("Not yet implemented")
            }

            override fun sysUartInit(
                ComID: Char,
                Boudrate: Int,
                flag_par: Char,
                flag_dbs: Char
            ): Int {
                TODO("Not yet implemented")
            }

            override fun sysUartClearBuffer(ComID: Char): Int {
                TODO("Not yet implemented")
            }

            override fun sysUartLogEn(en: Boolean): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetGpioValue(num: Int): Int {
                TODO("Not yet implemented")
            }

            override fun sysSetGpioValue(num: Int, type: Boolean) {
                TODO("Not yet implemented")
            }

            override fun sysSetIOGpioValue(num: String?, type: Boolean) {
                TODO("Not yet implemented")
            }

            override fun sysGetIOGpioValue(num: String?): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetHWVersion(): Int {
                TODO("Not yet implemented")
            }

            override fun sysGetEleTouchVersion(): String {
                TODO("Not yet implemented")
            }

            override fun sysControlEleTouch(type: Int): Int {
                TODO("Not yet implemented")
            }

            override fun sysSetLinuxShell(command: String?) {
                TODO("Not yet implemented")
            }

            override fun sysGetAppServerVersionName(): String {
                TODO("Not yet implemented")
            }

            override fun sysSetSecondsigned(type: Boolean) {
                TODO("Not yet implemented")
            }

            override fun sysPeripheralsAutomaticallySleep(enable: Boolean) {
                TODO("Not yet implemented")
            }

            override fun getKeyRecentState(): Int {
                TODO("Not yet implemented")
            }

            override fun setKeyRecentState(state: Boolean) {
                TODO("Not yet implemented")
            }

            override fun getKeyHomeState(): Int {
                TODO("Not yet implemented")
            }

            override fun setKeyHomeState(state: Boolean) {
                TODO("Not yet implemented")
            }

            override fun getKeyPowerState(): Int {
                TODO("Not yet implemented")
            }

            override fun setKeyPowerState(state: Boolean) {
                TODO("Not yet implemented")
            }

            override fun getKeyBackState(): Int {
                TODO("Not yet implemented")
            }

            override fun setKeyBackState(state: Boolean) {
                TODO("Not yet implemented")
            }

            override fun getStatusbarState(): Int {
                TODO("Not yet implemented")
            }

            override fun setStatusbarState(state: Boolean) {
                TODO("Not yet implemented")
            }

            override fun setAdbDebug(status: Boolean): Int {
                TODO("Not yet implemented")
            }

            override fun setBootLogo(logoPath: String?): Int {
                TODO("Not yet implemented")
            }

            override fun setBootAnimation(animationPath: String?): Int {
                TODO("Not yet implemented")
            }

            override fun getOemVersion(): String {
                TODO("Not yet implemented")
            }

            override fun getPrivateVersion(): String {
                TODO("Not yet implemented")
            }

            override fun updateOEM(oemPath: String?): Int {
                TODO("Not yet implemented")
            }

            override fun updatePrivate(privatePath: String?): Int {
                TODO("Not yet implemented")
            }

        }
    }

    override fun getISecureChipManager(): ISecureChipManager {
        TODO("Not yet implemented")
    }

}