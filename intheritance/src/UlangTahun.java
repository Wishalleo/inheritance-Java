class UlangTahun extends TanggalLahir
{
    private String acara="unknown";
    private String tempat="unknown";
    
    UlangTahun (String tanggal, String bulan, String tahun)
    {
        super(tanggal, bulan, tahun);
    }
    
    UlangTahun (String tanggal, String bulan, String tahun, String acara, String tempat)
    {
        super.setTanggal(tanggal);
        super.setBulan(bulan);
        super.setTahun(tahun);
       
        this.acara = acara; 
        this.tempat = tempat;
    }
    
    
    public String getAcara()
    {
        return acara;
    }
    
    public String getTempat()
    {
        return tempat;
    }
}