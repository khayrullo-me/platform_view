package com.example.prlatform_view_example.prlatform_view_example.new


import android.content.Context
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory

class MyNavigationPlatformViewFactory (
    private val myContext: Context
): PlatformViewFactory(StandardMessageCodec.INSTANCE) {
    override fun create(context: Context, viewId: Int, args: Any?): PlatformView {
        return MyNavigationPlatformView(myContext)
    }
}