package com.theironyard.invoicify.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theironyard.invoicify.models.Invoice;
import com.theironyard.invoicify.models.InvoiceLineItem;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	

}
