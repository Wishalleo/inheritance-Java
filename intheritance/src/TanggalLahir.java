class TanggalLahir
{
    String tanggal, bulan, tahun;
    
    TanggalLahir()
    {     
    }
    
    TanggalLahir(String tanggal, String bulan, String tahun)
    {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public void setTanggal(String t)
    {
        tanggal = t;
    } 
    public void setBulan(String b)
    {
        bulan = b;
    } 
    public void setTahun(String t)
    {
        tahun = t;
    } 
    
    public String getTanggal(){
    
        return tanggal;
        
    }
    
    public String getBulan()
    {
    
        return bulan;
        
    }
    public String getTahun()
    {
    
        return tahun;
        
    }

}