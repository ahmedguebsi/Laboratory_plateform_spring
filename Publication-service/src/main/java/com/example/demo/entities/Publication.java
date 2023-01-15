package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Publication {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id ;
	@NonNull@Temporal(TemporalType.DATE)
	Date date;
	@NonNull
	String titre;
	@NonNull
	String lien;
	@NonNull
	String type;
	@NonNull
	String sourcepdf;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSourcepdf() {
		return sourcepdf;
	}
	public void setSourcepdf(String sourcepdf) {
		this.sourcepdf = sourcepdf;
	}
	
	
	
	
	

}
