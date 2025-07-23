package com.example.prlatform_view_example.prlatform_view_example.new


import android.content.Context
import android.view.View
import androidx.fragment.app.FragmentActivity
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.plugin.platform.PlatformView

class MyNavigationPlatformView(context: Context) : PlatformView {

    private val fragmentContainerId = View.generateViewId()
    private val container: View

    init {
        val activity = context as? FragmentActivity
            ?: throw IllegalStateException("Activity must be FragmentActivity | ${context}")

        val frameLayout = android.widget.FrameLayout(context)
        frameLayout.id = fragmentContainerId

        container = frameLayout

        activity.supportFragmentManager
            .beginTransaction()
            .replace(fragmentContainerId, NavigationFragment())
            .commitAllowingStateLoss()
    }

    override fun getView(): View = container

    override fun dispose() {}
}