package com.rsp.openbankingpart1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class Openbankingpart1ApplicationTests {


	@Test
	void contextLoads() {
	}

	@Test
	void testTransactionService() {
		int testAccountNumber = 111;
		TransactionService transactionService = new TransactionService();
		int numberOfTransactions = transactionService.findAllByAccountNumber(testAccountNumber).size();
		Assertions.assertTrue(numberOfTransactions == 5);
	}

}
