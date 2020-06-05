package cn.qd.peiwen.pwwheelview;

final class OnItemSelectedRunnable implements Runnable {
    final WheelView wheelView;

    OnItemSelectedRunnable(WheelView loopview) {
        wheelView = loopview;
    }

    @Override
    public final void run() {
        wheelView.onItemSelectedListener.onItemSelected(wheelView, wheelView.getSelectedItem());
    }
}
