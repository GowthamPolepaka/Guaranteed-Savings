package finance.shared.entities.bnpl.schemas

import finance.shared.entities.bnpl.schemas.LoanTransactions.nullable
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IdTable
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.javatime.datetime

object LoanTransactions : IdTable<String>("loan_transaction") {
    var transactionId = varchar("transaction_id", 255).uniqueIndex()
    val totalAmount = double("total_amount")
    val lender = reference("lender_id", LenderMasters.lenderId)
    val lenderName= varchar("lender_name", 255).nullable()
    val tender = reference("tender_id", TendersMaster.tenderId)
    val merchant = reference("merchant_id", MerchantMasters.merchantId)
    val merchantOrderId = varchar("merchant_order_id", 255)
    val orderId = varchar("order_id", 255).nullable()
    val customerHash = varchar("customer_hash", 255)
    val customerID = varchar("customer_id", 255).nullable()
    val minDownPayment = double("min_down_payment").nullable()
    val maxDownPayment = double("max_down_payment").nullable()
    val downPayment = double("down_payment").nullable()
    val dealerId = varchar("dealer_id", 255).nullable()
    val limitId = varchar("limit_id", 255).nullable()
    val paymentId = varchar("payment_id", 255).nullable()
    val otpResendCount = integer("otp_resend_count")
    val otpAuthId = varchar("otp_auth_id", 255).nullable()
    val pincode = varchar("pincode", 255).nullable()
    val status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = transactionId.entityId()
}

object LoanTransactionsStaging : IdTable<String>("loan_transaction_staging") {
    val transactionId = varchar("transaction_id", 255).uniqueIndex()
    val totalAmount = double("total_amount")
    val lender = reference("lender_id", LenderMasters.lenderId)
    val lenderName=varchar("lender_name", 255).nullable()
    val tender = reference("tender_id", TendersMaster.tenderId)
    val merchant = reference("merchant_id", MerchantMasters.merchantId)
    val merchantOrderId = varchar("merchant_order_id", 255)
    val orderId = varchar("order_id", 255).nullable()
    val customerHash = varchar("customer_hash", 255)
    val customerID = varchar("customer_id", 255).nullable()
    val minDownPayment = double("min_down_payment").nullable()
    val maxDownPayment = double("max_down_payment").nullable()
    val downPayment = double("down_payment").nullable()
    val dealerId = varchar("dealer_id", 255).nullable()
    val limitId = varchar("limit_id", 255).nullable()
    val paymentId = varchar("payment_id", 255).nullable()
    val otpResendCount = integer("otp_resend_count")
    val otpAuthId = varchar("otp_auth_id", 255).nullable()
    val pincode = varchar("pincode", 255).nullable()
    val status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = transactionId.entityId()
}

object LoanSubTransactions : IdTable<String>("loan_sub_transaction") {
    var loanTransactionId = reference("transaction_id", LoanTransactions)
    val subTransactionId = varchar("sub_transaction_id", 255)
    val type = varchar("type", 255)
    val neuCoins = double("neu_coins").nullable()
    val loanAmount = double("loan_amount")
    val minDownPayment = double("min_down_payment").nullable()
    val maxDownPayment = double("max_down_payment").nullable()
    val downPayment = double("down_payment").nullable()
    val prePayment = double("pre_payment").nullable()
    val advanceEmiCount = integer("advance_emi_count").nullable()
    val advanceEmiAmount = double("advance_emi_amount").nullable()
    val rateOfInterest = double("rate_of_interest").nullable()
    val status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    var lenderDiscount= double("lender_discount").nullable()
    override val id: Column<EntityID<String>> = subTransactionId.entityId()
}

object LoanSubTransactionsStaging : IdTable<String>("loan_sub_transaction_staging") {
    var loanTransactionId = reference("transaction_id", LoanTransactionsStaging)
    val subTransactionId = varchar("sub_transaction_id", 255)
    val type = varchar("type", 255)
    val neuCoins = double("neu_coins").nullable()
    val loanAmount = double("loan_amount")
    val minDownPayment = double("min_down_payment").nullable()
    val maxDownPayment = double("max_down_payment").nullable()
    val downPayment = double("down_payment").nullable()
    val prePayment = double("pre_payment").nullable()
    val advanceEmiCount = integer("advance_emi_count").nullable()
    val advanceEmiAmount = double("advance_emi_amount").nullable()
    val rateOfInterest = double("rate_of_interest").nullable()
    val status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    var lenderDiscount= double("lender_discount").nullable()
    override val id: Column<EntityID<String>> = subTransactionId.entityId()
}

object TransactionProducts : IdTable<String>("transaction_product") {
    val transactionProductId = varchar("transaction_product_id", 255)
    val subTransaction = reference("sub_transaction_id", LoanSubTransactions)
    val imeiNumber = varchar("imei_number", 255).nullable()
    val category = varchar("category", 255).nullable()
    val color = varchar("color", 255).nullable()
    val skuId = varchar("sku_id", 255)
    val modelId = varchar("model_id", 255).nullable()
    val price = varchar("price", 255).nullable()
    val description = varchar("description", 255).nullable()
    val serialNumber = varchar("serial_number", 255).nullable()
    val status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = transactionProductId.entityId()
}

object TransactionProductsStaging : IdTable<String>("transaction_product_staging") {
    val transactionProductId = varchar("transaction_product_id", 255)
    val subTransaction = reference("sub_transaction_id", LoanSubTransactionsStaging)
    val imeiNumber = varchar("imei_number", 255).nullable()
    val category = varchar("category", 255).nullable()
    val color = varchar("color", 255).nullable()
    val skuId = varchar("sku_id", 255)
    val modelId = varchar("model_id", 255).nullable()
    val price = varchar("price", 255).nullable()
    val description = varchar("description", 255).nullable()
    val serialNumber = varchar("serial_number", 255).nullable()
    val status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = transactionProductId.entityId()
}

object TransactionSchemes : IdTable<String>("transaction_schm") {
    var subTransaction = reference("sub_transaction_id", LoanSubTransactions)
    var transactionSchmId = varchar("transaction_schm_id", 255)
    var schmId = varchar("schm_id", 255)
    val tenure = integer("tenure").nullable()
    val processingFee = double("processing_fee").nullable()
    val tenureType = varchar("tenure_type", 10).nullable()
    val emiDiscount = double("emi_discount").nullable()
    val isNoCost = bool("is_no_cost").nullable()
    val emi= double("emi").nullable()
    val isSelected = bool("is_selected").nullable()
    val interest = double("interest").nullable()
    var status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = transactionSchmId.entityId()

}

object TransactionSchemesStaging : IdTable<String>("transaction_schm_staging") {
    var subTransaction = reference("sub_transaction_id", LoanSubTransactionsStaging)
    var transactionSchmId = varchar("transaction_schm_id", 255)
    var schmId = varchar("schm_id", 255)
    val tenure = integer("tenure").nullable()
    val processingFee = double("processing_fee").nullable()
    val tenureType = varchar("tenure_type", 10).nullable()
    val emiDiscount = double("emi_discount").nullable()
    val isNoCost = bool("is_no_cost").nullable()
    val emi=double("emi").nullable()
    val isSelected = bool("is_selected").nullable()
    val interest = double("interest").nullable()
    var status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = transactionSchmId.entityId()
}

object TendersMaster : IdTable<String>("tender_master") {
    var tenderId = varchar("tender_id", 255)
    var tenderCode = varchar("tender_code", 255)
    var tenderDesc = varchar("tender_desc", 255)
    var status = varchar("status", 255)
    val createdOn = datetime("created_on")
    val createdBy = varchar("created_by", 255)
    val updatedOn = datetime("updated_on")
    val updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = tenderId.entityId()
}
object Limits:IdTable<String>("limit") {
    var limitId=varchar("limit_id", 255).uniqueIndex()
    var customerHash =varchar("customer_hash", 255)
    var customerId=varchar("customer_id", 255).nullable()
    var tenderId = varchar("tender_id",255)

    var limitType = varchar("limit_type",255)
    var availableLimit=double("available_limit")
    var minTransactionAmount=double("min_transaction_amount")
    var maxTransactionAmount=double("max_transaction_amount").nullable()
    var utilisedLimit=double("utilised_limit").nullable()
    var totalLimit=double("total_limit")
    var limitStatus=varchar("limit_status",255)
    var inactiveReason=varchar("inactive_reason", 255).nullable()
    var lenderId = varchar("lender_id", 255)
    var maxInstallmentAmount=double("max_installment_amount").nullable()
    var maxTransactionAmountWithoutDownpayment=double("max_transaction_amount_without_downpayment").nullable()
    var downpaymentType=varchar("downpayment_type",255).nullable()
    var minDownpaymentValue=double("min_downpayment_value").nullable()
    var status = varchar("status", 255)
    var createdOn = datetime("created_on")
    var createdBy = varchar("created_by", 255)
    var updatedOn = datetime("updated_on")
    var updatedBy = varchar("updated_by", 255)
    override val id: Column<EntityID<String>> = limitId.entityId()
}

object TransactionStatusApiCallTrackings: IntIdTable("transaction_status_api_call_tracking") {
    var loanTransactionId = varchar("loan_transaction_id",255)
    var apiCallTimestamp = datetime("api_call_timestamp").nullable()
}