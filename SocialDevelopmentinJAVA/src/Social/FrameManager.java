package Social;

import javax.swing.JFrame;
import java.util.Stack;

public class FrameManager {
    private static Stack<JFrame> frameStack = new Stack<>();

    public static void pushFrame(JFrame frame) {
        frameStack.push(frame);
    }

    public static void popFrame() {
        if (!frameStack.isEmpty()) {
            JFrame previousFrame = frameStack.pop();
            previousFrame.setVisible(true);
        }
    }
}
