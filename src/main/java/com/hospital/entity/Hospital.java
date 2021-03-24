/*
 * package com.hospital.entity;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.Id; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "HOSPITAL") public class Hospital {
 * 
 * @Id
 * 
 * @Column(name = "ID") private String hospitalId;
 * 
 * @Column(name = "NAME") private String name;
 * 
 * @Column(name = "SPECIALITY") private String speciality;
 * 
 * @Column(name = "CONTACT") private String contact;
 * 
 * @Column(name = "EMAIL") private String email;
 * 
 * @Column(name = "ADDRESS") private String address; public String
 * getHospitalId() { return hospitalId; } public void setHospitalId(String
 * hospitalId) { this.hospitalId = hospitalId; } public String getName() {
 * return name; } public void setName(String name) { this.name = name; } public
 * String getSpeciality() { return speciality; } public void
 * setSpeciality(String speciality) { this.speciality = speciality; } public
 * String getContact() { return contact; } public String getEmail() { return
 * email; } public void setEmail(String email) { this.email = email; } public
 * void setContact(String contact) { this.contact = contact; } public String
 * getAddress() { return address; } public void setAddress(String address) {
 * this.address = address; }
 * 
 * 
 * // @OneToMany(cascade = CascadeType.ALL, // fetch = FetchType.EAGER, //
 * mappedBy = "staff") // private List<Staff> staff;
 * 
 * }
 */