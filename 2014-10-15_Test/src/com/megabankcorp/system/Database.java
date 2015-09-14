/**
 * 
 */
package com.megabankcorp.system;

import com.megabankcorp.records.Account;

/**
 * @author SmPatel
 *
 */
public abstract class Database {

	abstract public void depoist(Account account, double amount);
	abstract public void withdraw(Account account, double amount);
	abstract protected double getBalance(Account account);

	final void transfer(Account fromAcc, Account toAcc, double amount){
		withdraw(fromAcc, amount);
		depoist(toAcc, amount);
	}

}
