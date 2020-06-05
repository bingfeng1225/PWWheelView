package cn.qd.peiwen.wheelview;

public interface OnItemScrollListener {
    /**
     * 滚轮滚动状态变化监听
     * @param wheelView
     * @param currentPassItem 当前经过的item
     * @param oldScrollState  上一次滚动状态
     * @param scrollState  当前滚动状态
     * @param totalScrollY 滚动距离
     */
    void onItemScrollStateChanged(WheelView wheelView, int currentPassItem, ScrollState oldScrollState, ScrollState scrollState, int totalScrollY);

    /***
     * 滚轮滚动监听
     * @param wheelView
     * @param currentPassItem 当前经过的item
     * @param scrollState 当前滚动状态
     * @param totalScrollY 滚动距离
     */
    void onItemScrolling(WheelView wheelView, int currentPassItem, ScrollState scrollState, int totalScrollY);
}
