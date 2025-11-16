package com.flam.edgedetection;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class EdgeDetectionActivity extends AppCompatActivity {
    static {
        System.loadLibrary("edge-detection");
    }
    private TextView fpsTextView;
    private Button toggleButton;
    private boolean isEdgeDetectionMode = true;
    public native void processFrame();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fpsTextView = findViewById(R.id.tv_fps);
        toggleButton = findViewById(R.id.btn_toggle);
        toggleButton.setOnClickListener(v -> {
            isEdgeDetectionMode = !isEdgeDetectionMode;
            toggleButton.setText(isEdgeDetectionMode ? "Edge Detection" : "Normal View");
        });
        fpsTextView.setText("FPS: --");
    }
}
