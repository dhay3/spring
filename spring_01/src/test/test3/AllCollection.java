package test.test3;

import java.util.*;

public class AllCollection {
    private List<String> listEle;
    //    相当于 int[] arrayEle=new int[]{}
    private int[] arrayEle;
    private Map<String, String> mapEle;
    private Set<String> setEle;
    private Properties propEle;

    public AllCollection() {
    }

    public AllCollection(List<String> listEle) {
        this.listEle = listEle;
    }

    public List<String> getListEle() {
        return listEle;
    }

    public void setListEle(List<String> listEle) {
        this.listEle = listEle;
    }

    public int[] getArrayEle() {
        return arrayEle;
    }

    public void setArrayEle(int[] arrayEle) {
        this.arrayEle = arrayEle;
    }

    public Map<String, String> getMapEle() {
        return mapEle;
    }

    public void setMapEle(Map<String, String> mapEle) {
        this.mapEle = mapEle;
    }

    public Set<String> getSetEle() {
        return setEle;
    }

    public void setSetEle(Set<String> set) {
        this.setEle = set;
    }

    public Properties getPropEle() {
        return propEle;
    }

    public void setPropEle(Properties propEle) {
        this.propEle = propEle;
    }

    @Override
    public String toString() {
        return "AllCollection{" +
                "list=" + listEle +
                ", array=" + Arrays.toString(arrayEle) +
                ", map=" + mapEle +
                ", set=" + setEle +
                ", properties=" + propEle +
                '}';
    }
}
