package cn.qd.peiwen.pwwheelview;

public enum ScrollState {
    SCROLL_STATE_IDLE,    // 停止滚动
    SCROLL_STATE_SETTING,  // 用户设置
    SCROLL_STATE_DRAGGING, // 用户按住滚轮拖拽
    SCROLL_STATE_SCROLLING // 依靠惯性滚动
}
