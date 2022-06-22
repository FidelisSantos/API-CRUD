package crud.rest.api.model;


import javax.persistence.*;
@Entity(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @Column(nullable = false, length = 700)
    public String url;
    @Column(nullable = false, length = 100)
    public String name;
    @Column(nullable = false, length = 11)
    public long cpf;
    @Column(length = 20)
    public String surName;
    @Column(nullable = false, length = 1)
    public String genre;
    @Column(nullable = false, length = 11)
    public long phone;
    @Column(nullable = false, length = 2)
    public String state;
    @Column(nullable = false, length = 40)
    public String district;
    @Column(nullable = false,length = 200)
    public String adress;
    @Column(nullable = false,length = 10)
    public int numberAdress;
    @Column(nullable = false,length = 30)
    public String adressComplement;
    @Column(nullable = false,length = 30)
    public String obs;
    @Column(length = 50)
    public String updatedDate;
    @Column(length = 50)
    public String createdate;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCPF() {
        return cpf;
    }

    public void setCPF(long cpf) {
        this.cpf = cpf;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberAdress() {
        return numberAdress;
    }

    public void setNumberAdress(int numberAdress) {
        this.numberAdress = numberAdress;
    }

    public String getAdressComplement() {
        return adressComplement;
    }

    public void setAdressComplement(String adressComplement) {
        this.adressComplement = adressComplement;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
