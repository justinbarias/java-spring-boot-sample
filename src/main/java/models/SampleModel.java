package models;

public class SampleModel {

    public SampleModel(String sampleName, String sampleDescription) {
        SampleName = sampleName;
        SampleDescription = sampleDescription;
    }

    public String getSampleName() {
        return SampleName;
    }

    public void setSampleName(String sampleName) {
        SampleName = sampleName;
    }

    public String SampleName;

    public String getSampleDescription() {
        return SampleDescription;
    }

    public void setSampleDescription(String sampleDescription) {
        SampleDescription = sampleDescription;
    }

    public String SampleDescription;
}
