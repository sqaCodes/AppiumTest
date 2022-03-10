package allTests;

import org.testng.annotations.Test;

public class TC_05_RecordVideo extends TC_04_SelectRifleScopeTest{
    @Test
    public void VideoRecording(){
        videoRecording.SwitchToTakeVideo();
        videoRecording.StartRecording();
    }
}
