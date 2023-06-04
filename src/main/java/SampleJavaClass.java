import org.jetbrains.annotations.Nullable;

public class SampleJavaClass {
    @Nullable
    String sample;

    public SampleJavaClass() {}

    public SampleJavaClass(String sample) {
        this.sample = sample;
    }

    public String getSample() {
        return sample;
    }
}
