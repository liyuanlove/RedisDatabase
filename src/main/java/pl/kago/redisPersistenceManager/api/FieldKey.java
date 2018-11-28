package pl.kago.redisPersistenceManager.api;


import pl.kago.redisPersistenceManager.api.FieldType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum FieldKey {

    // record Id, internal -> not part of Nordea copybook
    ID(FieldType.LONG),

    // record Id, internal -> not part of Nordea copybook
    ID_TRANSACTION_RECORD_STAT(FieldType.LONG),
    ID_BALANCE_STAT(FieldType.LONG),
    ID_CONTRACT_STAT(FieldType.LONG),
    ID_CUSTOMER_STAT(FieldType.LONG),
    ID_INFO_RECORD_STAT(FieldType.LONG),
    ID_GL_RECON_RECORD_STAT(FieldType.LONG),

    /* Record Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-REC-TYPE)
     * - GBTI EOD - BBS, BOB (EODBAL-REC-TYPE)
     * - GBTI EOD - Contract Info Record (INFOREC-REC-TYPE)
     * - GBTI Core - Transaction (CORE-REC-TYPE)
     *  */
    REC_TYPE(FieldType.INTEGER),

    DATA_PACKAGE_ID(FieldType.INTEGER),

    RULE_NAME(FieldType.STRING),

    PROC_INSTANCE_EXEC_ID(FieldType.STRING),

    DATA_FLOW_CODE(FieldType.STRING),

    REC_PROC_PER_DATE(FieldType.LOCAL_DATE),

    STATUS_IND(FieldType.STRING),

    /* Transaction Type
     * maps to RecordType enum
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TRANS-TYPE)
     * - GBTI EOD - BBS, BOB (EODBAL-TRANS-TYPE)
     * - GBTI EOD - Contract Info Record (INFOREC-TRANS-TYPE)
     * - GBTI Core - Transaction (CORE-TRANS-TYPE)
     *  */
    TRANS_TYPE(FieldType.STRING),

    ORIGINAL_TRANS_TYPE(FieldType.STRING),

    /* Ticket Group
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TICKET-GRP)
     * - GBTI EOD - BBS, BOB (EODBAL-TICKET-GRP)
     * - GBTI EOD - Contract Info Record (INFOREC-TICKET-GRP)
     * - GBTI Core - Transaction (CORE-TICKET-GRP)
     *  */
    TICKET_GRP(FieldType.LONG),

    /* Ticket Sequence Number
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TICKET-SEQ-NO)
     * - GBTI EOD - BBS, BOB (EODBAL-TICKET-SEQ-NO)
     * - GBTI EOD - Contract Info Record (INFOREC-TICKET-SEQ-NO)
     * - GBTI Core - Transaction (CORE-TICKET-SEQ-NO)
     *  */
    TICKET_SEQ_NO(FieldType.LONG),

    /* Currency Code
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-CURRENCY)
     * - GBTI EOD - BBS, BOB (EODBAL-CURRENCY)
     * - GBTI EOD - Contract Info Record (INFOREC-CURRENCY)
     * - GBTI Core - Transaction (CORE-CURRENCY)
     *  */
    CURRENCY(FieldType.STRING),

    /* Currency Code
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-REC-FMT-VER)
     * - GBTI EOD - BBS, BOB (EODBAL-REC-FMT-VER )
     * - GBTI EOD - Contract Info Record (INFOREC-REC-FMT-VER )
     * - GBTI Core - Transaction (CORE-REC-FMT-VER)
     *  */
    REC_FMT_VER(FieldType.INTEGER),

    /* Ledger Region
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-LEDGER-REGION)
     * - GBTI Core - Transaction (CORE-LEDGER-REGION)
     * - GBTI EOD - BBS, BOB (LEDGER_REGION)
     * - GBTI EOD - Contract Info Record (INFOREC-LEDGER-REGION)
     *  */
    LEDGER_REGION(FieldType.STRING),

    /* Local Ledger Code
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-LOCAL-LEDGER-CODE)
     * - GBTI Core - Transaction (CORE-LOCAL-LEDGER-CODE)
     * - GBTI EOD - BBS, BOB (LOCAL_LEDGER_CODE)
     * - GBTI EOD - Contract Info Record (INFOREC-LOCAL-LEDGER-CODE)
     *  */
    LOCAL_LEDGER_CODE(FieldType.STRING),

    /*
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-GBTI-CONTRACT-KEY)
     *  */
    CONTRACT_KEY(FieldType.STRING),

    /* Legal Contract Id
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-CONTRACT-ID)
     * - GBTI Core - Transaction (CORE-CONTRACT-ID)
     * - GBTI EOD - BBS, BOB (LEGAL_CONTRACT_ID)
     * - GBTI EOD - Contract Info Record (INFOREC-CONTRACT-ID)
     *  */
    CONTRACT_ID(FieldType.STRING),

    /* Legal Contract Id Extension
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-CONTRACT-ID-EXT)
     * - GBTI Core - Transaction (CORE-CONTRACT-ID-EXT)
     * - GBTI EOD - BBS, BOB (LEGAL_CONTRACT_ID_EXTENSION)
     * - GBTI EOD - Contract Info Record (INFOREC-CONTRACT-ID-EXT)
     *  */
    CONTRACT_ID_EXT(FieldType.STRING),

    /* Local Customer ID
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-LOCAL-CUST-ID)
     *  */
    LOCAL_CUST_ID(FieldType.STRING),

    /* Company Code Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-COMP-VAL-TYPE)
     * - GBTI Core - Transaction (CORE-COMP-VAL-TYPE)
     *  */
    COMP_VAL_TYPE(FieldType.STRING),

    /* Company Code
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-COMPANY-CODE)
     * - GBTI Core - Transaction (CORE-COMPANY-CODE)
     *  */
    COMPANY_CODE(FieldType.STRING),

    /* Accounting Unit Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-AU-VAL-TYPE)
     * - GBTI Core - Transaction (CORE-AU-VAL-TYPE)
     *  */
    AU_VAL_TYPE(FieldType.STRING),

    /* Accounting Unit
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-ACC-UNIT)
     * - GBTI Core - Transaction (CORE-ACC-UNIT)
     *  */
    ACC_UNIT(FieldType.STRING),

    /* Temporary Dimension Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TMP-DIM-VAL-TYPE)
     * - GBTI Core - Transaction (CORE-TMP-DIM-VAL-TYPE)
     *  */
    TMP_DIM_VAL_TYPE(FieldType.STRING),

    /* Temporary Dimension
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TEMP-DIM)
     * - GBTI Core - Transaction (CORE-TEMP-DIM)
     *  */
    TEMP_DIM(FieldType.STRING),

    /* Product Code Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PROD-CODE-VAL-TYPE)
     *  */
    PROD_CODE_VAL_TYPE(FieldType.STRING),

    /* Product Code
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PRODUCT-CODE)
     *  */
    PRODUCT_CODE(FieldType.STRING),

    /* Performing/Non Performing Status Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PERF-VAL-TYPE)
     *  */
    PERF_VAL_TYPE(FieldType.STRING),

    /* Performing/Non Performing Status Value Type from CUF record
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PERF-VAL-TYPE)
     *  */
    PERF_VAL_TYPE_CUS(FieldType.STRING),

    /* Performing/Non Performing Status
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PERF-STATUS)
     *  */
    PERF_STATUS(FieldType.STRING),

    /* Performing/Non Performing Status from CUF record
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PERF-STATUS)
     *  */
    PERF_STATUS_CUS(FieldType.STRING),

    /* Interest Rate Type Debet Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INTR-TYPE-VAL-TYPE-D)
     *  */
    INTR_TYPE_VAL_TYPE_D(FieldType.STRING),

    /* Interest Rate Type Debet
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TYPE-OF-INTRATE-DEB)
     *  */
    TYPE_OF_INTRATE_DEB(FieldType.STRING),

    /* Interest Rate Type Credit Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INTR-TYPE-VAL-TYPE-C)
     *  */
    INTR_TYPE_VAL_TYPE_C(FieldType.STRING),

    /* Interest Rate Type Credit
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-TYPE-OF-INTRATE-CRED)
     *  */
    TYPE_OF_INTRATE_CRED(FieldType.STRING),

    /* On Demand Non Demand Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-DEMAND-VAL-TYPE)
     *  */
    DEMAND_VAL_TYPE(FieldType.STRING),

    /* On Demand Non Demand
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-DEMAND)
     *  */
    DEMAND(FieldType.STRING),

    /* Portfolio Type Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PORTF-VAL-TYPE)
     *  */
    PORTF_VAL_TYPE(FieldType.STRING),

    /* Portfolio Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-PORTF-TYPE)
     *  */
    PORTF_TYPE(FieldType.STRING),

    /* Own Issuance Indicator Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-OWN-ISS-VAL-TYPE)
     *  */
    OWN_ISS_VAL_TYPE(FieldType.STRING),

    /* Own Issuance Indicator
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-OWN-ISSUANCE)
     *  */
    OWN_ISSUANCE(FieldType.STRING),

    /* Contract Fixed Extra 1 Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-EXTRA1-VAL-TYPE)
     *  */
    EXTRA1_VAL_TYPE(FieldType.STRING),

    /* Contract Fixed Extra 1
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-EXTRA1)
     *  */
    EXTRA1(FieldType.STRING),

    /* Contract Fixed Extra 2 Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-EXTRA2-VAL-TYPE)
     *  */
    EXTRA2_VAL_TYPE(FieldType.STRING),

    /* Contract Fixed Extra 2
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-EXTRA2)
     *  */
    EXTRA2(FieldType.STRING),

    /* Calculation of Internal Interest in Ledger
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-CALC-INT-INTREST)
     *  */
    CALC_INT_INTREST(FieldType.STRING),

    /* Internal Interest Rate Sign
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INT-INTR-RATE-SIGN)
     *  */
    INT_INTR_RATE_SIGN(FieldType.STRING),

    /* Internal Interest Rate
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INT-INTR-RATE)
     *  */
    INT_INTR_RATE(FieldType.BIG_DECIMAL),

    /* Day Rate Convention Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-DAY-RATE-CONV-VAL-TYPE)
     *  */
    DAY_RATE_CONV_VAL_TYPE(FieldType.STRING),

    /* Day Rate Convention
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-DAY-RATE-CONV)
     *  */
    DAY_RATE_CONV(FieldType.STRING),

    /* Next Interest Payment Date
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-NXT-INT-PAY-DATE)
     *  */
    NXT_INT_PAY_DATE(FieldType.LOCAL_DATE),

    /* Interest Rate Subtype Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INT-SUBTYP-VAL-TYPE)
     *  */
    INT_SUBTYP_VAL_TYPE(FieldType.STRING),

    /* Interest Rate Subtype
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INT-SUBTYP)
     *  */
    INT_SUBTYP(FieldType.STRING),

    /* Rate Reference Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-RATE-REF-VAL-TYPE)
     *  */
    RATE_REF_VAL_TYPE(FieldType.STRING),

    /* Rate Reference
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-RATE-REF)
     *  */
    RATE_REF(FieldType.STRING),

    /* Customer Responsible Unit Value Type
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-CRU-VAL-TYPE)
     *  */
    CRU_VAL_TYPE(FieldType.STRING),

    /* Customer Responsible Unit
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-CRU)
     *  */
    CRU(FieldType.STRING),

    /* Internal Interest Rate 2
     * Nordea copybook:
     * - GBTI EOD COF (CONFIX-INT-INTR-RATE2)
     *  */
    INT_INTR_RATE2(FieldType.BIG_DECIMAL),


    /* Booking Type (Common)
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-BOOKING-TYPE)
     * - GBTI EOD - BBS, BOB (BOOKING_TYPE)
     * - GBTI EOD - Contract Info Record (INFOREC-BOOKING-TYPE)
     *  */
    BOOKING_TYPE(FieldType.LONG),

    /* Booking Group */
    BOOKING_GROUP(FieldType.INTEGER),

    /* Debit/Credit Indicator
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-DEB-CRED)
     * - GBTI EOD - BBS, BOB (DEBIT_CREDIT_INDICATOR)
     * - GBTI EOD - Contract Info Record (INFOREC-DEB-CRED)
     *  */
    DEB_CRED(FieldType.STRING),

    /* Original Sign
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-SIGN)
     * - GBTI EOD - BBS, BOB (ORIGINAL_SIGN)
     * - GBTI EOD - Contract Info Record (INFOREC-SIGN)
     *  */
    SIGN(FieldType.STRING),

    /* Amount in Transaction Currency
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-AMOUNT)
     * - GBTI EOD - BBS, BOB (ENDING_BALANCE_AMOUNT)
     * - GBTI EOD - Contract Info Record (INFOREC-AMOUNT)
     *  */
    AMOUNT(FieldType.BIG_DECIMAL),

    /* Source Registration Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-SRC-REG-DATE)
     *  */
    SRC_REG_DATE(FieldType.LOCAL_DATE),

    /* Posting Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-POSTING-DATE)
     *  */
    POSTING_DATE(FieldType.LOCAL_DATE),

    // balance record date
    RECORD_DATE(FieldType.LOCAL_DATE),

    /* Local Reference
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-LOCAL-REF)
     *  */
    LOCAL_REF(FieldType.STRING),

    /* Local Booking Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-LOCAL-BOOKING-TYPE)
     * - GBTI EOD - BBS, BOB (LOCAL_BOOKING_TYPE)
     * - GBTI EOD - Contract Info Record (INFOREC-LOCAL-BOOKING-TYPE)
     *  */
    LOCAL_BOOKING_TYPE(FieldType.STRING),

    /* Business Transaction Process Id
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-BUS-TRANS-PROC-ID)
     *  */
    BUS_TRANS_PROC_ID(FieldType.STRING),

    /* Business Transaction Partition
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-BUS-TRANS-PART)
     *  */
    BUS_TRANS_PART(FieldType.STRING),

    /* Business Transaction Serial Number
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-BUS-TRANS-SER-NO)
     *  */
    BUS_TRANS_SER_NO(FieldType.LONG),

    /* Transaction Sequence Number
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-TRANS-SEQ-NO)
     *  */
    TRANS_SEQ_NO(FieldType.LONG),

    /* Deliver To Ledger
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-DELIV-TO-LEDGER)
     *  */
    DELIV_TO_LEDGER(FieldType.STRING),

    /* GL Account Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-GL-ACC-VAL-TYPE)
     *  */
    GL_ACC_VAL_TYPE(FieldType.STRING),

    /* GL Account
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-GL-ACCOUNT)
     *  */
    GL_ACCOUNT(FieldType.STRING),

    /* Cost Center Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-COST-CENTER-VAL-TYPE)
     *  */
    COST_CENTER_VAL_TYPE(FieldType.STRING),

    /* Cost Center
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-COST-CENTER)
     *  */
    COST_CENTER(FieldType.STRING),

    /* GL Customer Group Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-CUST-GRP-VAL-TYPE)
     *  */
    CUST_GRP_VAL_TYPE(FieldType.STRING),

    /* GL Customer Group
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-GL-CUST-GRP)
     *  */
    GL_CUST_GRP(FieldType.STRING),

    /* Counterpart Company Code Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-C-COMP-VAL-TYPE)
     *  */
    C_COMP_VAL_TYPE(FieldType.STRING),

    /* Counterpart Company Code (Trading Partner)
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-C-COMP-CODE)
     *  */
    C_COMP_CODE(FieldType.STRING),

    /* Counterpart Accounting Unit Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-C-AU-VAL-TYPE)
     *  */
    C_AU_VAL_TYPE(FieldType.STRING),

    /* Counterpart Accounting Unit (Partner Profit Center)
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-C-ACC-UNIT)
     *  */
    C_ACC_UNIT(FieldType.STRING),

    /* Project Code Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-PROJ-VAL-TYPE)
     *  */
    PROJ_VAL_TYPE(FieldType.STRING),

    /* Project Code (Internal Order in SAP GL)
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-PROJ-CODE)
     *  */
    PROJ_CODE(FieldType.STRING),

    /* VAT Code Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-VAT-VAL-TYPE)
     *  */
    VAT_VAL_TYPE(FieldType.STRING),

    /* VAT Code
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-VAT-CODE)
     *  */
    VAT_CODE(FieldType.STRING),

    /* Tick Off Account Value Type
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-TICK-OFF-ACCNT-VAL-TYPE)
     * - Comrec: tol_acc_val_type
     *  */
    //TICK_OFF_ACCNT_VAL_TYPE(FieldType.STRING),

    /* Tick Off Account
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-TICK-OFF-ACCNT)
     *  */
    TICK_OFF_ACCNT(FieldType.STRING),

    /* Tick Off Id
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-TICK-OFF-ID)
     *  */
    TICK_OFF_ID(FieldType.STRING),

    /* Covered/Uncovered Indicator
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-COV-UNCOV)
     * - GBTI EOD - BBS, BOB (COVERED_INDICATOR)
     * - GBTI EOD - Contract Info Record (INFOREC-COV-UNCOV)
     *  */
    COV_UNCOV(FieldType.STRING),

    /* Aggregation Indicator
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-AGGR-IND)
     *  */
    AGGR_IND(FieldType.STRING),

    /* Extra GL Acc Determination Param 1
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-EXTRA-GLACC-DET1)
     *  */
    EXTRA_GLACC_DET1(FieldType.STRING),

    /* Extra GL Acc Determination Param 2
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-EXTRA-GLACC-DET2)
     *  */
    EXTRA_GLACC_DET2(FieldType.STRING),

    /* Extra GL Acc Determination Param 3
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-EXTRA-GLACC-DET3)
     *  */
    EXTRA_GLACC_DET3(FieldType.STRING),

    /* Invoice Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-INVOICE-DATE)
     *  */
    INVOICE_DATE(FieldType.LOCAL_DATE),

    /* Funding Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-FUNDING-DATE)
     *  */
    FUNDING_DATE(FieldType.LOCAL_DATE),

    /* Translation Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-TRANSL-DATE)
     *  */
    TRANSL_DATE(FieldType.LOCAL_DATE),

    /* Accrual Reversal Indicator
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-ACC-REV)
     *  */
    ACC_REV(FieldType.STRING),

    /* Reversal Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-REV-DATE)
     * - GBTI EOD - Contract Info Record (INFOREC-REV-DATE)
     *  */
    REV_DATE(FieldType.LOCAL_DATE),

    /* GBTI Core Entry Date
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-GBTI-ENTRY-DATE)
     *  */
    GBTI_ENTRY_DATE(FieldType.LOCAL_DATE),

    /* GBTI Core Timestamp
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-GBTI-TSTAMP)
     *  */
    GBTI_TSTAMP(FieldType.STRING),

    /* Internally Created
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-INTERNAL)
     *  */
    INTERNAL(FieldType.STRING),

    /* Ticket Group - GBTI Core Input
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-INPUT-TICKET-GRP)
     *  */
    INPUT_TICKET_GRP(FieldType.LONG),

    /* Ticket Sequence Number - GBTI Core Input
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-INPUT-TICKET-SEQ-NO)
     *  */
    INPUT_TICKET_SEQ_NO(FieldType.LONG),

    /* SECTOR CODE VALUE TYPE
    CUSFIX-SECTOR-VAL-TYPE - CUF flat file
    */
    SECTOR_VAL_TYPE(FieldType.STRING),
    /* SECTOR CODE
       CUSFIX-SECTOR-CODE  - CUF flat file
    */
    SECTOR(FieldType.STRING),
    /* CUSTOMER COUNTRY
       CUSFIX-COUNTRY  - CUF flat file
     */
    COUNTRY(FieldType.STRING),

    STATUS(FieldType.STRING),

    /*
     * Initial Balances Validation
     */
    LEGAL_CONTRACT_ID(FieldType.STRING),

    /* Internally Created
     * Nordea copybook:
     * - GBTI Core - Transaction (CORE-INTERNAL)
     *  */
    INTERNALLY_CREATED(FieldType.STRING),

    // TODO add to DB
    TICK_OFF_ACCNT_VAL_TYPE(FieldType.STRING),

    SRC_CODE(FieldType.STRING),

    LOC_ACC_UNIT(FieldType.STRING),

    TYPE_OF_SOURCE(FieldType.STRING),

    TPPC_EXT_INT(FieldType.STRING),

    BAL_OFFBAL(FieldType.STRING),

    EXT_INT(FieldType.STRING),

    LEDGER_IND(FieldType.STRING),

    LOC_GL_ACCOUNT(FieldType.STRING),

    LOC_PROJ_CODE(FieldType.STRING),

    LOC_GL_CUST_GRP(FieldType.STRING),

    LOC_TEMP_DIM(FieldType.STRING),

    LOC_PRODUCT_CODE(FieldType.STRING),

    LOC_PERF_STATUS(FieldType.STRING),

    LOC_TYPE_OF_INT_D(FieldType.STRING),

    LOC_TYPE_OF_INT_C(FieldType.STRING),

    LOC_PORTF_TYPE(FieldType.STRING),

    LOC_OWN_ISSUANCE(FieldType.STRING),

    LOC_VAT_CODE(FieldType.STRING),

    LOC_PPC(FieldType.STRING),

    LOC_COST_CENTRE(FieldType.STRING),

    LOC_DEMAND(FieldType.STRING),

    LOC_PERF_STATUS_CUS(FieldType.STRING),

    GRP_PERF_STATUS(FieldType.STRING),

    ERROR_NUMBER(FieldType.INTEGER),

    II_DATE(FieldType.LOCAL_DATE),

    II_INT_RATE_TYPE(FieldType.STRING),

    II_DAY_RATE_CONV(FieldType.STRING),

    II_NO_OF_DAYS(FieldType.INTEGER),

    II_POSTING_DATE_DRAFT(FieldType.LOCAL_DATE),

    II_RATE_SIGN(FieldType.STRING),

    II_RATE(FieldType.BIG_DECIMAL),

    II_DR_CONV_FACTOR(FieldType.BIG_DECIMAL),

    II_DEB_CRED(FieldType.STRING),

    II_AMOUNT(FieldType.BIG_DECIMAL),

    II_POSTING_CONV(FieldType.STRING),

    II_BBS_DEB_CRED(FieldType.STRING),

    II_BBS_AMOUNT(FieldType.BIG_DECIMAL),

    II_RATE2(FieldType.BIG_DECIMAL),

    CONST_TYPE(FieldType.STRING),

    CRU_PROC_IND(FieldType.STRING);

    private static List<FieldKey> TECHNICAL_FIELDS = Arrays.asList(new FieldKey[]{DATA_PACKAGE_ID, RULE_NAME, DATA_FLOW_CODE, STATUS});
    private FieldType fieldType;

    FieldKey(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public static FieldKey getID() {
        return ID;
    }

    private static List<FieldKey> getFieldsWithoutTechnical(FieldKey[] fields, List<FieldKey> technicalFields) {
        return Arrays.stream(fields).filter(f -> !technicalFields.contains(f)).collect(Collectors.toList());
    }

    public static List<FieldKey> getTechnicalFields() {
        return TECHNICAL_FIELDS;
    }


    public static FieldKey getRecordType() {
        return TRANS_TYPE;
    }

    public static FieldKey getStatus() {
        return STATUS;
    }

    public static FieldKey getPostingDate() {
        return POSTING_DATE;
    }

    public static FieldKey getRecordDate() {
        return RECORD_DATE;
    }

    public static FieldKey getRuleName() {
        return RULE_NAME;
    }

    public static FieldKey getProcessInstanceExecutionId() {
        return PROC_INSTANCE_EXEC_ID;
    }

    public static FieldKey getDataFlowCode() {
        return FieldKey.DATA_FLOW_CODE;
    }

    public static boolean isStatForeignKey(FieldKey fieldKey) {
        return fieldKey == ID_TRANSACTION_RECORD_STAT || fieldKey == ID_BALANCE_STAT || fieldKey == ID_CONTRACT_STAT || fieldKey == ID_CUSTOMER_STAT
                || fieldKey == ID_INFO_RECORD_STAT || fieldKey == ID_GL_RECON_RECORD_STAT;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

}
