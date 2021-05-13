package com.vmloft.develop.library.example.ui.demo.anim

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.setMargins
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.alibaba.android.arouter.facade.annotation.Route

import com.vmloft.develop.library.example.R
import com.vmloft.develop.library.common.base.BaseActivity
import com.vmloft.develop.library.example.router.AppRouter
import com.vmloft.develop.library.tools.utils.VMDimen

import kotlinx.android.synthetic.main.activity_demo_anim_lottie.*


/**
 * Created by lzan13 on 2017/4/7.
 * 描述：测试 Lottie 动画
 */
@Route(path = AppRouter.appLottieAnim)
class LottieAnimActivity : BaseActivity() {

    private val lottieAnimList: MutableList<String> = mutableListOf()

    override fun layoutId(): Int = R.layout.activity_demo_anim_lottie

    override fun initUI() {
        super.initUI()
        setTopTitle("Lottie 动画")
    }

    override fun initData() {

        lottieAnimList.add("assistant_robot")
        lottieAnimList.add("audio_record_play_receive")
        lottieAnimList.add("audio_record_play_receive_night")
        lottieAnimList.add("audio_record_play_send")
        lottieAnimList.add("audio_record_play_send_night")
        lottieAnimList.add("audio_song")
        lottieAnimList.add("audio_song_together")
        lottieAnimList.add("bell_white")
        lottieAnimList.add("camera_switch_black")
        lottieAnimList.add("camera_switch_white")
        lottieAnimList.add("chat_dice_game")
        lottieAnimList.add("chat_dismiss")
        lottieAnimList.add("chat_dismiss_night")
        lottieAnimList.add("chat_online_eye")
        lottieAnimList.add("chat_online_eye_night")
        lottieAnimList.add("chat_show")
        lottieAnimList.add("chat_show_night")
        lottieAnimList.add("common_loading")
        lottieAnimList.add("cpnt_login_log_loading_button")
        lottieAnimList.add("cpnt_musicstory_double_click_like")
        lottieAnimList.add("cpnt_musicstory_lot_music_story_play")
        lottieAnimList.add("cpnt_planet_bell_light")
        lottieAnimList.add("cpnt_planet_bell_night")
        lottieAnimList.add("cpnt_planet_bell_on_light")
        lottieAnimList.add("cpnt_planet_bell_on_night")
        lottieAnimList.add("cpnt_planet_flutter_love")
        lottieAnimList.add("cpnt_planet_lot_call_match_end_approval")
        lottieAnimList.add("cpnt_planet_lot_planet_guide_entrance")
        lottieAnimList.add("cpnt_planet_love_bell_note")
        lottieAnimList.add("cpnt_planet_pia_chat_guide")
        lottieAnimList.add("cpnt_planet_pia_come")
        lottieAnimList.add("cpnt_planet_pia_guide")
        lottieAnimList.add("cpnt_planet_pia_load_sense")
        lottieAnimList.add("cpnt_planet_pia_play_finish")
        lottieAnimList.add("cpnt_planet_pia_ready")
        lottieAnimList.add("cpnt_planet_pia_time_count")
        lottieAnimList.add("cpnt_planet_planet_lovering_appear")
        lottieAnimList.add("cpnt_planet_planet_lovering_circle")
        lottieAnimList.add("cpnt_planet_planet_lovering_dismiss")
        lottieAnimList.add("cpnt_planet_planet_lovering_open")
        lottieAnimList.add("cpnt_planet_planet_lovering_unopen")
        lottieAnimList.add("cpnt_planet_ring_love")
        lottieAnimList.add("cpnt_planet_teenager")
        lottieAnimList.add("cpnt_planet_wolf")
        lottieAnimList.add("cpnt_setting_input_chat_loading")
        lottieAnimList.add("cpnt_square_lot_post_dislike_day")
        lottieAnimList.add("cpnt_square_lot_post_like_day")
        lottieAnimList.add("cpnt_square_share_guide")
        lottieAnimList.add("heart_blue")
        lottieAnimList.add("heart_red")
        lottieAnimList.add("icon_lovering_filtering_violet")
        lottieAnimList.add("immerse_tip_lottie")
        lottieAnimList.add("immerse_video_dislike")
        lottieAnimList.add("immerse_video_like")
        lottieAnimList.add("input_assistant_loading")
        lottieAnimList.add("input_chat_loading")
        lottieAnimList.add("input_chat_loading_night")
        lottieAnimList.add("input_loading")
        lottieAnimList.add("intimacy_b_0")
        lottieAnimList.add("intimacy_b_1")
        lottieAnimList.add("intimacy_b_2")
        lottieAnimList.add("intimacy_b_3")
        lottieAnimList.add("intimacy_b_4")
        lottieAnimList.add("intimacy_r_0")
        lottieAnimList.add("intimacy_r_1")
        lottieAnimList.add("intimacy_r_2")
        lottieAnimList.add("intimacy_r_3")
        lottieAnimList.add("intimacy_r_4")
        lottieAnimList.add("level1_up")
        lottieAnimList.add("level2_up")
        lottieAnimList.add("level3_up")
        lottieAnimList.add("level4_up")
        lottieAnimList.add("level5_up")
        lottieAnimList.add("lot_add_coin")
        lottieAnimList.add("lot_app_guide")
        lottieAnimList.add("lot_avatar_card_img")
        lottieAnimList.add("lot_call")
        lottieAnimList.add("lot_call_match_coin")
        lottieAnimList.add("lot_call_public")
        lottieAnimList.add("lot_call_wait_public")
        lottieAnimList.add("lot_calling")
        lottieAnimList.add("lot_chat_img_loading")
        lottieAnimList.add("lot_click_edit_guide")
        lottieAnimList.add("lot_clockon")
        lottieAnimList.add("lot_clockon_guide")
        lottieAnimList.add("lot_discovery_mail")
        lottieAnimList.add("lot_enter_kkq")
        lottieAnimList.add("lot_exposure")
        lottieAnimList.add("lot_exposure_guide")
        lottieAnimList.add("lot_gift")
        lottieAnimList.add("lot_gift_wall")
        lottieAnimList.add("lot_guard_prop")
        lottieAnimList.add("lot_kkq")
        lottieAnimList.add("lot_loading")
        lottieAnimList.add("lot_loading_progress")
        lottieAnimList.add("lot_lovering_filter_appear")
        lottieAnimList.add("lot_lovering_filter_filtering")
        lottieAnimList.add("lot_lovering_filter_finish")
        lottieAnimList.add("lot_lovering_speed_appear")
        lottieAnimList.add("lot_lovering_speed_finish")
        lottieAnimList.add("lot_lovering_speed_speeding")
        lottieAnimList.add("lot_music_dialog_wave")
        lottieAnimList.add("lot_nielian")
        lottieAnimList.add("lot_planet_video_match")
        lottieAnimList.add("lot_post_collect")
        lottieAnimList.add("lot_post_collect_night")
        lottieAnimList.add("lot_post_detail_gift_tip")
        lottieAnimList.add("lot_post_discollect")
        lottieAnimList.add("lot_post_discollect_night")
        lottieAnimList.add("lot_post_dislike_night")
        lottieAnimList.add("lot_post_like_night")
        lottieAnimList.add("lot_publish_record")
        lottieAnimList.add("lot_publish_record_end")
        lottieAnimList.add("lot_publish_record_play")
        lottieAnimList.add("lot_publish_recording")
        lottieAnimList.add("lot_publish_reocrd_appear")
        lottieAnimList.add("lot_set_chat_bg")
        lottieAnimList.add("lot_soul_match")
        lottieAnimList.add("lot_tag_follow")
        lottieAnimList.add("lot_tag_load")
        lottieAnimList.add("lot_user_super")
        lottieAnimList.add("lot_user_super_no")
        lottieAnimList.add("lot_video_match_drop_smile")
        lottieAnimList.add("lot_video_match_love_empty")
        lottieAnimList.add("lot_video_match_love_empty_to_half")
        lottieAnimList.add("lot_video_match_love_full")
        lottieAnimList.add("lot_video_match_love_half")
        lottieAnimList.add("lot_video_match_love_half_to_full")
        lottieAnimList.add("lot_video_match_small_love")
        lottieAnimList.add("lot_video_post_follow")
        lottieAnimList.add("lottie_icon_music_shake")
        lottieAnimList.add("lottie_publish_guide_window")
        lottieAnimList.add("lottie_switch_camera_black")
        lottieAnimList.add("lottie_switch_camera_white")
        lottieAnimList.add("lovering_circle")
        lottieAnimList.add("lovering_switch")
        lottieAnimList.add("mine_dismiss")
        lottieAnimList.add("mine_dismiss_night")
        lottieAnimList.add("mine_show")
        lottieAnimList.add("mine_show_night")
        lottieAnimList.add("music_story_featured")
        lottieAnimList.add("music_story_like")
        lottieAnimList.add("music_story_next_music")
        lottieAnimList.add("music_story_unlike")
        lottieAnimList.add("musicstory")
        lottieAnimList.add("open_camera")
        lottieAnimList.add("open_camera_night")
        lottieAnimList.add("pia_voice_guide")
        lottieAnimList.add("planet_show")
        lottieAnimList.add("planet_show_night")
        lottieAnimList.add("planet_test")
        lottieAnimList.add("planetb_card_fliterchatroom")
        lottieAnimList.add("publish_board_custom_expression")
        lottieAnimList.add("publish_board_custom_expression_night")
        lottieAnimList.add("room_atmophere")
        lottieAnimList.add("room_atom_animate")
        lottieAnimList.add("room_combo_word")
        lottieAnimList.add("room_fenwei")
        lottieAnimList.add("room_radio_animate")
        lottieAnimList.add("room_sound_wave")
        lottieAnimList.add("share_guide_night")
        lottieAnimList.add("speaking")
        lottieAnimList.add("speakingblue")
        lottieAnimList.add("speakingpink")
        lottieAnimList.add("speakingpurple")
        lottieAnimList.add("speakingyellow")
        lottieAnimList.add("spectrum")
        lottieAnimList.add("status_record_coming")
        lottieAnimList.add("status_record_end")
        lottieAnimList.add("status_record_playing")
        lottieAnimList.add("status_record_start")
        lottieAnimList.add("status_recording")
        lottieAnimList.add("tab_chat_appear")
        lottieAnimList.add("tab_chat_appear_night")
        lottieAnimList.add("tab_chat_disappear")
        lottieAnimList.add("tab_chat_disappear_night")
        lottieAnimList.add("tab_discover_appear")
        lottieAnimList.add("tab_discover_appear_night")
        lottieAnimList.add("tab_discover_disappear")
        lottieAnimList.add("tab_discover_disappear_night")
        lottieAnimList.add("tab_home_publish")
        lottieAnimList.add("tab_planet_appear")
        lottieAnimList.add("tab_planet_appear_night")
        lottieAnimList.add("tab_planet_disappear")
        lottieAnimList.add("tab_planet_disappear_night")
        lottieAnimList.add("tab_refresh_appear")
        lottieAnimList.add("tab_refresh_appear_night")
        lottieAnimList.add("tab_self_appear")
        lottieAnimList.add("tab_self_appear_night")
        lottieAnimList.add("tab_self_disappear")
        lottieAnimList.add("tab_self_disappear_night")
        lottieAnimList.add("tab_square_appear")
        lottieAnimList.add("tab_square_appear_night")
        lottieAnimList.add("tab_square_disappear")
        lottieAnimList.add("tab_square_disappear_night")
        lottieAnimList.add("three_points")
        lottieAnimList.add("video_preview_guide")
        bindLottieData()
    }

    private fun bindLottieData() {
        for (fileName in lottieAnimList) {
            val lottieView = LayoutInflater.from(this)
                .inflate(R.layout.lottie_anim_item, null)
            val lottieAnimView = lottieView.findViewById<LottieAnimationView>(R.id.lottieAnimView)
            lottieAnimView.imageAssetsFolder = "lottie/images/${fileName}"
            // 设置动画资源
            lottieAnimView.setAnimation("lottie/json/${fileName}.json")
            // 设置重复次数
            lottieAnimView.repeatCount = LottieDrawable.INFINITE
            // 开始播放
            lottieAnimView.playAnimation()

            // 设置名称
            val lottieAnimName = lottieView.findViewById<TextView>(R.id.lottieAnimName)
            lottieAnimName.text = fileName

            val margin = VMDimen.dp2px(8)
            val lp: ViewGroup.MarginLayoutParams = ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT)
            lp.setMargins(margin)
            viewGroup.addView(lottieView, lp)
        }
    }

}