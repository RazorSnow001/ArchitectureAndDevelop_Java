package Stream.Foreach;

import java.util.ArrayList;
import java.util.List;

public class TestMultipleForeach {
    public static class Summary {
        private String summaryId;
        private List<Detail> detailList;

        public String getSummaryId() {
            return summaryId;
        }

        public void setSummaryId(String summaryId) {
            this.summaryId = summaryId;
        }

        public List<Detail> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<Detail> detailList) {
            this.detailList = detailList;
        }
    }

    public static class Detail {
        private String detailId;
        private String summaryId;

        public String getDetailId() {
            return detailId;
        }

        public void setDetailId(String detailId) {
            this.detailId = detailId;
        }

        public String getSummaryId() {
            return summaryId;
        }

        public void setSummaryId(String summaryId) {
            this.summaryId = summaryId;
        }
    }

    public static void main(String[] args) {
        Summary summary = new Summary();
        Summary summary2 = new Summary();

        summary.setSummaryId("1");
        summary2.setSummaryId("2");

        Detail detail = new Detail();
        detail.setDetailId("11");
        detail.setSummaryId("1");
        Detail detail2 = new Detail();
        detail2.setDetailId("22");
        detail2.setSummaryId("1");

        List<Detail> list = new ArrayList<>();
        List<Detail> list2 = new ArrayList<>();

        Detail detail3 = new Detail();
        detail3.setDetailId("33");
        detail3.setSummaryId("2");
        Detail detail4 = new Detail();
        detail4.setDetailId("44");
        detail4.setSummaryId("2");


        list.add(detail);
        list.add(detail2);

        list2.add(detail3);
        list2.add(detail4);

        summary.setDetailList(list);
        summary2.setDetailList(list2);

        List<Summary> summaryList = new ArrayList<>();
        summaryList.add(summary);
        summaryList.add(summary2);

        summaryList.forEach(s -> {
            s.getDetailList().forEach(d -> {
                System.out.println(d.getSummaryId());
                System.out.println(d.getDetailId());
            });
        });


    }
}
