import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JohnTravolta {
    public static void main(String[] args) {
        int jam = 40;
        int pengeluaran = 600000;
        int gaji=0;

        gaji= hitungGaji(jam , gaji);

        if(gaji > pengeluaran){
            int tabungan=gaji-pengeluaran;
            System.out.println("Bisa Menabung, dengan tabungan sebesar Rp."+tabungan);
        }else if(gaji == pengeluaran){
            System.out.println("Tidak Bisa Menabung");
        }else if(gaji < pengeluaran){
            System.out.println("Cari Tambahan");
        }
    }

    public static int hitungGaji(int jam, int gaji){
        if(jam < 40){
            gaji = jam * 15000;
        }else if(jam >= 40){
            jam = jam - 40;
            gaji = (jam * 22500) + 600000;
        }
        return gaji;
    }
    @Test
    public void testJohn(){
        assertEquals(600000, hitungGaji(40,0));
    }
}
