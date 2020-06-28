package com.vmloft.develop.library.tools.widget.loading

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import androidx.annotation.FloatRange


/**
 * Create by lzan13 on 2020/6/28 17:53
 * 描述：
 */
abstract class VMLoadingBuilder : ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /**
     * 外部可以修改，但是不建议
     */
    var DEFAULT_SIZE = 56.0f
    val ANIMATION_START_DELAY: Long = 333
    val ANIMATION_DURATION: Long = 1333

    private var mAllSize = 0f
    private var mViewWidth = 0f
    private var mViewHeight = 0f

    private var mCallback: Drawable.Callback? = null
    private var mFloatValueAnimator: ValueAnimator? = null

    private var mDurationTimePercent = 1.0

    fun init(context: Context) {
        mAllSize = dip2px(context, DEFAULT_SIZE * 0.5f - 12)
        mViewWidth = dip2px(context, DEFAULT_SIZE)
        mViewHeight = dip2px(context, DEFAULT_SIZE)
        initAnimators()
    }

    private fun initAnimators() {
        mFloatValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f)
        mFloatValueAnimator?.setRepeatCount(Animation.INFINITE)
        mFloatValueAnimator?.setDuration(getAnimationDuration())
        mFloatValueAnimator?.setStartDelay(getAnimationStartDelay())
        mFloatValueAnimator?.setInterpolator(LinearInterpolator())
    }

    protected abstract fun initParams(context: Context)

    protected abstract fun onDraw(canvas: Canvas)

    protected abstract fun setAlpha(alpha: Int)

    protected abstract fun prepareStart(animation: ValueAnimator)

    protected abstract fun prepareEnd()

    protected abstract fun computeUpdateValue(animation: ValueAnimator, @FloatRange(from = 0.0, to = 1.0) animatedValue: Float)

    protected abstract fun setColorFilter(colorFilter: ColorFilter?)

    fun setCallback(callback: Drawable.Callback?) {
        mCallback = callback
    }

    fun draw(canvas: Canvas?) {
        onDraw(canvas)
    }

    fun start() {
        if (mFloatValueAnimator!!.isStarted) {
            return
        }
        mFloatValueAnimator!!.addUpdateListener(this)
        mFloatValueAnimator!!.addListener(this)
        mFloatValueAnimator!!.repeatCount = Animation.INFINITE
        mFloatValueAnimator!!.duration = getAnimationDuration()
        prepareStart(mFloatValueAnimator)
        mFloatValueAnimator!!.start()
    }

    fun stop() {
        mFloatValueAnimator!!.removeAllUpdateListeners()
        mFloatValueAnimator!!.removeAllListeners()
        mFloatValueAnimator!!.repeatCount = 0
        mFloatValueAnimator!!.duration = 0
        prepareEnd()
        mFloatValueAnimator!!.end()
    }

    fun isRunning(): Boolean {
        return mFloatValueAnimator!!.isRunning
    }

    override fun onAnimationUpdate(animation: ValueAnimator) {
        computeUpdateValue(animation, animation.animatedValue as Float)
        invalidateSelf()
    }

    private fun invalidateSelf() {
        mCallback?.invalidateDrawable(null)
    }

    override fun onAnimationStart(animation: Animator?) {}

    override fun onAnimationEnd(animation: Animator?) {}

    override fun onAnimationCancel(animation: Animator?) {}

    override fun onAnimationRepeat(animation: Animator?) {}

    fun setDurationTimePercent(durationTimePercent: Double) {
        mDurationTimePercent = if (durationTimePercent <= 0) {
            1.0
        } else {
            durationTimePercent
        }
    }

    protected fun getAnimationStartDelay(): Long {
        return ANIMATION_START_DELAY
    }

    protected fun getAnimationDuration(): Long {
        return ceil(ANIMATION_DURATION * mDurationTimePercent)
    }

    protected fun getIntrinsicHeight(): Float {
        return mViewHeight
    }

    protected fun getIntrinsicWidth(): Float {
        return mViewWidth
    }

    protected fun getViewCenterX(): Float {
        return getIntrinsicWidth() * 0.5f
    }

    protected fun getViewCenterY(): Float {
        return getIntrinsicHeight() * 0.5f
    }

    protected fun getAllSize(): Float {
        return mAllSize
    }

    protected fun dip2px(context: Context, dpValue: Float): Float {
        val scale: Float = context.getResources().getDisplayMetrics().density
        return dpValue * scale
    }

    protected fun ceil(value: Double): Long {
        return Math.ceil(value).toLong()
    }
}