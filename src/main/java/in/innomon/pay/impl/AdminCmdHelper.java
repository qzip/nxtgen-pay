/*
* Copyright (c) 2016, BON BIZ IT Services Pvt LTD.
*
* The Universal Permissive License (UPL), Version 1.0
* 
* Subject to the condition set forth below, permission is hereby granted to any person obtaining a copy of this software, associated documentation and/or data (collectively the "Software"), free of charge and under any and all copyright rights in the Software, and any and all patent rights owned or freely licensable by each licensor hereunder covering either (i) the unmodified Software as contributed to or provided by such licensor, or (ii) the Larger Works (as defined below), to deal in both

* (a) the Software, and

* (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if one is included with the Software (each a “Larger Work” to which the Software is contributed by such licensors),
* 
* without restriction, including without limitation the rights to copy, create derivative works of, display, perform, and distribute the Software and make, use, sell, offer for sale, import, export, have made, and have sold the Software and the Larger Work(s), and to sublicense the foregoing rights on either these or other terms.
* 
* This license is subject to the following condition:
* 
* The above copyright notice and either this complete permission notice or at a minimum a reference to the UPL must be included in all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
* 
* Author: Ashish Banerjee, ashish@bonbiz.in
*/

package in.innomon.pay.impl;

import in.qzip.pay.txn.TxnException;

/**
 *
 * @author ashish
 */
public interface AdminCmdHelper {
    public boolean isAdmin(String emailId);
    // Admin REG creates a new mobile and KYC pin
    public void register(String mobile, int kycPin) throws TxnException;
    // User receives KYC PIN by SMS and regesters using REGISTER command
    public void userRegistration(String email, String nickName, String mobile, int kycPin) throws TxnException;
    
    public String getAccountName(String email) throws TxnException;
    public String getAccountEmail(String accountName) throws TxnException;
    
    public double getAccountBalance(String accountName) throws TxnException; 
    public long   genOtp(String email, double maxAmount) throws TxnException; 
    // Admin can load Money
    public String loadMoney(String accountName, double amount) throws TxnException; 
    public String unloadMoney(String accountName, double amount) throws TxnException; 
    public String pullMoney(String fromAccountName, String toAccountName, double amount, long otp) throws TxnException;
    
    public String getPrimaryMMID(String mobile);
    
}