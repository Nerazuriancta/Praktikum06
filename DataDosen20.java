public class DataDosen20 {
    LatihanDosen20[] listDosen = new LatihanDosen20[10];
    int idx;

    public void tambah(LatihanDosen20 d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    public void tampil() {
        for (LatihanDosen20 d : listDosen) {
            if (d != null) {
                d.tampil();
            }
        }
    }

    public void selectionSort() {
        for (int i=0; i<idx; i++) {
            int idxMax = i;
            for (int j = i+1; j<idx; j++) {
                if (listDosen[j].usia > listDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            LatihanDosen20 tmp = listDosen[idxMax];
            listDosen[idxMax] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    LatihanDosen20 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }
}
