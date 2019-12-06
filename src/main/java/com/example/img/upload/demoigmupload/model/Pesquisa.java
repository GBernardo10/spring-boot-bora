package com.example.img.upload.demoigmupload.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "pesquisa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pesquisa {
	
	@Id
	private ObjectId _id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvento;
	
	@Indexed
	@TextIndexed
	private String titulo;
	@Indexed
	@TextIndexed
	private String categoria;
	@Indexed
	@TextIndexed
	private String rua;
	@Indexed
	@TextIndexed
	private String bairro;
	private String numero;
	private Double latitude;
	private Double longitude;
	@Indexed
	@TextIndexed
	private List<String> participantes;
	@Indexed
	@TextIndexed
	private String organizador;
}
