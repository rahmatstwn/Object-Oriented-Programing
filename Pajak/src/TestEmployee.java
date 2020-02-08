
public class TestEmployee {
    public static void main(String[] args) {
        Employee baru = new Employee (118140097, "Rahmat", "Setiawan", 5000000);
        System.out.println("================ WAJIB PAJAK 2019 ===================");
        System.out.println("ID                              : "+baru.GetID());
        System.out.println("Nama                            : "+baru.GetName());
        System.out.println("Pajak/bulan                     : "+baru.GetSalary());
        System.out.println("Pajak/tahun                     : "+baru.GetAnnualSalary());
        System.out.println("Pajak Yang Harus di bayarkan    : "+baru.raiseSalary(0.5));
        System.out.println(baru.toString());
        System.out.println("====================================================="+"\n");

    }


}
