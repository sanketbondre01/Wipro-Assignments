package com.surya.example.ex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrrorMessage {

	private String message;
	private String status;
}
