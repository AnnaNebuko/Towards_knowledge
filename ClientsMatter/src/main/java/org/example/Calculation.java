package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Calculation {
    public void calculate(List<Info> lineList) {
        Map<Integer, List<Info>> map = lineList.stream()
            .collect(Collectors.groupingBy(Info::getId, Collectors.toList()));

        TreeMap<Integer, List<Info>> sortedMap = new TreeMap<>(map);

        for (Integer key : sortedMap.keySet()) {
            sortedMap.get(key).sort(new Comparator<Info>() {
                @Override
                public int compare(Info o1, Info o2) {
                    Integer x1 = o1.getD();
                    Integer x2 = o2.getD();
                    int sComp = x1.compareTo(x2);

                    if (sComp != 0) {
                        return sComp;
                    }

                    Integer y1 = o1.getH();
                    Integer y2 = o2.getH();
                    sComp = y1.compareTo(y2);

                    if (sComp != 0) {
                        return sComp;
                    }

                    Integer z1 = o1.getM();
                    Integer z2 = o2.getM();
                    return z1.compareTo(z2);
                }
            });
        }
        for (Map.Entry<Integer, List<Info>> e : sortedMap.entrySet()) {
            List<Info> value = e.getValue();
            Collections.reverse(value);

            int result = 0;
            int sum = 0;
            for(Info info : value) {
                if (Objects.equals(info.getSt(), "C") || Objects.equals(info.getSt(), "S")) {
                    result = info.getD()*60*24 + info.getH()*60 + info.getM();
                }
                if (Objects.equals(info.getSt(), "A")) {
                    sum = sum + result - (info.getD()*60*24 + info.getH()*60 + info.getM());
                }
            }
            System.out.print(sum + " ");
        }
    }
}
