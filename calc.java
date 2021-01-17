import javax.swing.*;

import jdk.jfr.Relational;

import java.awt.event.*;

public class calc implements ActionListener {

    //Net Worth Calculator Label
    JLabel nwc;
    
    //START OF ASSETS
    JLabel assetsLabel;
    //start of cash and cash equivalents
    JLabel cashAndCashEquivalentsLabel;
    
    JLabel checkingLabel;
    JLabel checkingDollarSignLabel;
    JTextField checkingTF;

    JLabel savingsLabel;
    JLabel savingsDollarSignLabel;
    JTextField savingsTF;

    JLabel moneyMarketAccountsLabel;
    JLabel moneyMarketAccountsDollarSignLabel;
    JTextField moneyMarketAccountsTF;

    JLabel savingBondsLabel;
    JLabel savingsBondsDollarSignLabel;
    JTextField savingsBondTF;

    JLabel cdsLabel;
    JLabel cdsDollarSignLabel;
    JTextField cdsTF;

    JLabel cashValueLifeInsuranceLabel;
    JLabel cashValueLifeInsuranceDollarSignLabel;
    JTextField cashValueLifeInsuranceTF;
    //end of cash and cash equivalents

    //start of invested assets
    JLabel investedAssetsLabel;

    JLabel brokerageLabel;
    JLabel brokerageDSL;
    JTextField brokerageTF;

    JLabel iraLabel;
    JLabel iraDSL;
    JTextField iraTF;
    
    JLabel rothiraLabel;
    JLabel rothiraDSL;
    JTextField rothiraTF;

    JLabel fourZeroOneKLabel;
    JLabel fourZeroOneKDSL;
    JTextField fourZeroOneKTF;

    JLabel sepiraLabel;
    JLabel sepiraDSL;
    JTextField sepiraTF;

    JLabel keoghLabel;
    JLabel keoughDSL;
    JTextField keoughTF;

    JLabel pensionLabel;
    JLabel pensionDSL;
    JTextField pensionTF;

    JLabel annuityLabel;
    JLabel annuityDSL;
    JTextField annuityTF;

    JLabel realestateLabel;
    JLabel realestateDSL;
    JTextField realestateTF;

    JLabel solePropietorshipLabel;
    JLabel solePropietorshipDSL;
    JTextField solePropietorshipTF;

    JLabel partnershipLabel;
    JLabel partnershipDSL;
    JTextField partnershipTF;

    JLabel cCorporationLabel;
    JLabel cCorporationDSL;
    JTextField cCorporationTF;

    JLabel sCorporationLabel;
    JLabel sCorporationDSL;
    JTextField sCorporationTF;

    JLabel limitedLiabilityCompanyLabel;
    JLabel limitedLiabilityCompanyDSL;
    JTextField limitedLiabilityCompanyTF;
    //end of invested assets

    //start of use assets   
    JLabel useAssetsLabel;

    JLabel principalHomeLabel;
    JLabel principalDSL;
    JTextField principalTF;

    JLabel vacationHomeLabel;
    JLabel vacationHomeDSL;
    JTextField vacationHomeTF;

    JLabel vehiclesLabel;
    JLabel vehiclesDSL;
    JTextField vehiclesTF;

    JLabel homeFurnishingLabel;
    JLabel homeFurnishingDSL;
    JTextField homeFurnishingTF;

    JLabel collectiblesLabel;
    JLabel collectiblesDSL;
    JTextField collectiblesTF;

    JLabel jewelryFursLabel;
    JLabel jewelryFurstDSL;
    JTextField jewelryFursTF;
    //end of use assets

    //start total assets label
    JLabel totalAssetsLabel;
    JLabel totalAssetsDSL;
    JTextField totalAssetsTF;
    //end total assets label
    //END OF ASSETS

    //START OF LIABILITIES
    JLabel liabilitiesLabel;
    //start of current liabilities
    JLabel currentLiabilitiesLabel;

    JLabel creditCardBalancesLabel;
    JLabel creditCardBalancesDSL;
    JTextField creditCardBalancesTF;

    JLabel incomeTaxOwedLabel;
    JLabel incomeTaxOwedDSL;
    JTextField incomeTaxOwedTF;

    JLabel otherBillsLabel;
    JLabel otherBillsDSL;
    JTextField otherBillsTF;
    //end of current liabilites

    //start of long term liabilities
    JLabel longTermLiabilitiesLabel;
    
    JLabel homeMortgageLabel;
    JLabel homeMortgageDSL;
    JTextField homeMortgageTF;
    
    JLabel homeEquityLoanLabel;
    JLabel homeEquityLoanDSL;
    JTextField homeEquityLoanTF;

    JLabel rentalPropertyMortgagesLabel;
    JLabel rentalPropertyMortgagesDSL;
    JTextField rentalPropertyMortgagesTF;

    JLabel carLoansLabel;
    JLabel carLoansDSL;
    JTextField carLoansTF;

    JLabel studentLoansLabel;
    JLabel studentLoansDSL;
    JTextField studentLoansTF;

    JLabel lifeInsuranceLoansLabel;
    JLabel lifeInsuranceLoansDSL;
    JTextField lifeInsuranceLoanTF;

    JLabel otherLongTermDebtLabel;
    JLabel otherLongTermDebtDSL;
    JTextField otherLongTermDebtTF;
    //end of long term liabilites

    //start of total liabilities
    JLabel totalLiabilitesLabel;
    JLabel totalLiabilitesDSL;
    JTextField totalLiabilitesTF;
    //end of total liabilities
    //END OF LIABILITIES

    //START OF TOTAL NET WORTH CALCULATION
    JLabel totalNetWorthLabel;
    JLabel totalNetWorthDSL;
    JTextField totalNetWorthTF;
    //END OF TOTAL NET WORTH CALCULATION

    calc() {
        JFrame frame = new JFrame();

        nwc = new JLabel("Personal Net Worth Calculator");
        nwc.setBounds(10,10,200,15);

        //START OF ASSETS
        assetsLabel = new JLabel("Assets:");
        assetsLabel.setBounds(10, 50, 100, 15);
        //start of cash and cash equivalents 
        cashAndCashEquivalentsLabel = new JLabel("Cash and Cash Equivalents");
        cashAndCashEquivalentsLabel.setBounds(10, 70, 200, 15);
        
        checkingLabel = new JLabel("Checking accounts:");
        checkingLabel.setBounds(30,100,200,15);
        checkingDollarSignLabel = new JLabel("$");
        checkingDollarSignLabel.setBounds(290,100,10,15);
        checkingTF = new JTextField();
        checkingTF.setBounds(300,100,150,15);

        savingsLabel = new JLabel("Savings accounts:");
        savingsLabel.setBounds(30,120,200,15);
        savingsDollarSignLabel = new JLabel("$");
        savingsDollarSignLabel.setBounds(290,120,10,15);
        savingsTF = new JTextField();
        savingsTF.setBounds(300,120,150,15);

        moneyMarketAccountsLabel = new JLabel("Money market accounts:");
        moneyMarketAccountsLabel.setBounds(30,140,200,15);
        moneyMarketAccountsDollarSignLabel = new JLabel("$");
        moneyMarketAccountsDollarSignLabel.setBounds(290,140,10,15);
        moneyMarketAccountsTF = new JTextField();
        moneyMarketAccountsTF.setBounds(300,140,150,15);

        savingBondsLabel = new JLabel("Savings bonds:");
        savingBondsLabel.setBounds(470,100,200,15);
        savingsBondsDollarSignLabel = new JLabel("$");
        savingsBondsDollarSignLabel.setBounds(750,100,10,15);
        savingsBondTF = new JTextField();
        savingsBondTF.setBounds(760,100,150,15);

        cdsLabel = new JLabel("CD's:");
        cdsLabel.setBounds(470,120,200,15);
        cdsDollarSignLabel = new JLabel("$");
        cdsDollarSignLabel.setBounds(750,120,10,15);
        cdsTF = new JTextField();
        cdsTF.setBounds(760,120,150,15);

        cashValueLifeInsuranceLabel = new JLabel("Cash value of life insurance:");
        cashValueLifeInsuranceLabel.setBounds(470,140,200,15);
        cashValueLifeInsuranceDollarSignLabel = new JLabel("$");
        cashValueLifeInsuranceDollarSignLabel.setBounds(750,140,10,15);
        cashValueLifeInsuranceTF = new JTextField();
        cashValueLifeInsuranceTF.setBounds(760,140,150,15);
        //end of cash and cash equivalents

        //start of invested assets
        investedAssetsLabel =  new JLabel("Invested Assets");
        investedAssetsLabel.setBounds(10,170,200,15);

        brokerageLabel = new JLabel("Brokerage:");
        brokerageLabel.setBounds(30,200,200,15);
        brokerageDSL = new JLabel("$");
        brokerageDSL.setBounds(150,200,10,15);
        brokerageTF = new JTextField();
        brokerageTF.setBounds(160,200,150,15);

        iraLabel = new JLabel("IRA:");
        iraLabel.setBounds(30, 220, 200, 15);
        iraDSL = new JLabel("$");
        iraDSL.setBounds(150, 220, 10, 15);
        iraTF = new JTextField();
        iraTF.setBounds(160,220, 150, 15);

        rothiraLabel = new JLabel("Roth IRA:");
        rothiraLabel.setBounds(30,240,200,15);
        rothiraDSL = new JLabel("$");
        rothiraDSL.setBounds(150,240,10,15);
        rothiraTF = new JTextField();
        rothiraTF.setBounds(160,240,150,15);
        
        fourZeroOneKLabel = new JLabel("401(K):");
        fourZeroOneKLabel.setBounds(30,260,200,15);
        fourZeroOneKDSL = new JLabel("$");
        fourZeroOneKDSL.setBounds(150,260,10,15);
        fourZeroOneKTF = new JTextField();
        fourZeroOneKTF.setBounds(160,260,150,15);

        sepiraLabel = new JLabel("SEP-IRA:");
        sepiraLabel.setBounds(30,280,200,15);
        sepiraDSL = new JLabel("$");
        sepiraDSL.setBounds(150,280,10,15);
        sepiraTF = new JTextField();
        sepiraTF.setBounds(160,280,150,15);

        keoghLabel = new JLabel("Keough:");
        keoghLabel.setBounds(320,200,200,15);
        keoughDSL = new JLabel("$");
        keoughDSL.setBounds(440,200,10,15);
        keoughTF = new JTextField();
        keoughTF.setBounds(450,200,150,15);

        pensionLabel = new JLabel("Pension:");
        pensionLabel.setBounds(320,220,200,15);
        pensionDSL = new JLabel("$");
        pensionDSL.setBounds(440,220,10,15);
        pensionTF = new JTextField();
        pensionTF.setBounds(450,220,150,15);

        annuityLabel = new JLabel("Annuity:");
        annuityLabel.setBounds(320,240,200,15);
        annuityDSL = new JLabel("$");
        annuityDSL.setBounds(440,240,10,15);
        annuityTF = new JTextField();
        annuityTF.setBounds(450,240,150,15);

        realestateLabel = new JLabel("Real estate:");
        realestateLabel.setBounds(320,260,200,15);
        realestateDSL = new JLabel("$");
        realestateDSL.setBounds(440,260,10,15);
        realestateTF = new JTextField();
        realestateTF.setBounds(450,260,150,15);

        solePropietorshipLabel = new JLabel("Sole propietorship:");
        solePropietorshipLabel.setBounds(320,280,200,15);
        solePropietorshipDSL = new JLabel("$");
        solePropietorshipDSL.setBounds(440,280,10,15);
        solePropietorshipTF = new JTextField();
        solePropietorshipTF.setBounds(450,280,150,15);

        partnershipLabel = new JLabel("Partnership:");
        partnershipLabel.setBounds(610,200,200,15);
        partnershipDSL = new JLabel("$");
        partnershipDSL.setBounds(740,200,10,15);
        partnershipTF = new JTextField();
        partnershipTF.setBounds(750,200,150,15);

        cCorporationLabel = new JLabel("C Corporation:");
        cCorporationLabel.setBounds(610,220,200,15);
        cCorporationDSL = new JLabel("$");
        cCorporationDSL.setBounds(740,220,10,15);
        cCorporationTF = new JTextField();
        cCorporationTF.setBounds(750,220,150,15);

        sCorporationLabel = new JLabel("S Corporation:");
        sCorporationLabel.setBounds(610,240,200,15);
        sCorporationDSL = new JLabel("$");
        sCorporationDSL.setBounds(740,240,10,15);
        sCorporationTF = new JTextField();
        sCorporationTF.setBounds(750,240,150,15);

        limitedLiabilityCompanyLabel = new JLabel("Liability company:");
        limitedLiabilityCompanyLabel.setBounds(610,260,200,15);
        limitedLiabilityCompanyDSL = new JLabel("$");
        limitedLiabilityCompanyDSL.setBounds(740,260,10,15);
        limitedLiabilityCompanyTF = new JTextField();
        limitedLiabilityCompanyTF.setBounds(750,260,150,15);
        //end of invested assets

        //start of use assets
        useAssetsLabel = new JLabel("Use Assets");
        useAssetsLabel.setBounds(10,310,200,15);

        principalHomeLabel = new JLabel("Principal home:");
        principalHomeLabel.setBounds(30,340,200,15);
        principalDSL = new JLabel("$");
        principalDSL.setBounds(290,340,10,15);
        principalTF = new JTextField();
        principalTF.setBounds(300,340,150,15);

        
        vacationHomeLabel = new JLabel("Vacation home:");
        vacationHomeLabel.setBounds(470,340,200,15);
        vacationHomeDSL = new JLabel("$");
        vacationHomeDSL.setBounds(750,340,10,15);
        vacationHomeTF = new JTextField();
        vacationHomeTF.setBounds(760,340,150,15);
        
        vehiclesLabel = new JLabel("Vehicles:");
        vehiclesLabel.setBounds(30,360,200,15);
        vehiclesDSL = new JLabel("$");
        vehiclesDSL.setBounds(290,360,10,15);
        vehiclesTF = new JTextField();
        vehiclesTF.setBounds(300,360,150,15);

        homeFurnishingLabel = new JLabel("Home furnishings:");
        homeFurnishingLabel.setBounds(470,360,200,15);
        homeFurnishingDSL = new JLabel("$");
        homeFurnishingDSL.setBounds(750,360,10,15);
        homeFurnishingTF = new JTextField();
        homeFurnishingTF.setBounds(760,360,150,15);

        collectiblesLabel = new JLabel("Collectibles:");
        collectiblesLabel.setBounds(30,380,200,15);
        collectiblesDSL = new JLabel("$");
        collectiblesDSL.setBounds(290,380,10,15);
        collectiblesTF = new JTextField();
        collectiblesTF.setBounds(300,380,150,15);

        jewelryFursLabel = new JLabel("Jewelry, furs:");
        jewelryFursLabel.setBounds(470,380,200,15);
        jewelryFurstDSL = new JLabel("$");
        jewelryFurstDSL.setBounds(750,380,10,15);
        jewelryFursTF = new JTextField();
        jewelryFursTF.setBounds(760,380,150,15);
        //end of use assets

        //start of total assets label
        totalAssetsLabel = new JLabel("TOTAL ASSETS:");
        totalAssetsLabel.setBounds(10,410,200,15);
        totalAssetsDSL = new JLabel("$");
        totalAssetsDSL.setBounds(110,410,10,15);
        totalAssetsTF = new JTextField();
        totalAssetsTF.setBounds(120,410,150,15);
        totalAssetsTF.setEditable(false);
        //end of total assets label
        //END OF ASSETS

        //START OF LIABILITIES
        liabilitiesLabel = new JLabel("Liabilites:");
        liabilitiesLabel.setBounds(10,440,200,15);
        //start of current liabilities
        currentLiabilitiesLabel = new JLabel("Current:");
        currentLiabilitiesLabel.setBounds(10,460,200,15);

        creditCardBalancesLabel = new JLabel("Credit cards:");
        creditCardBalancesLabel.setBounds(30,490,200,15);
        creditCardBalancesDSL = new JLabel("$");
        creditCardBalancesDSL.setBounds(150,490,10,15);
        creditCardBalancesTF = new JTextField();
        creditCardBalancesTF.setBounds(160,490,150,15);

        incomeTaxOwedLabel = new JLabel("Income tax:");
        incomeTaxOwedLabel.setBounds(320,440,200,115);
        incomeTaxOwedDSL = new JLabel("$");
        incomeTaxOwedDSL.setBounds(440,490,10,15);
        incomeTaxOwedTF = new JTextField();
        incomeTaxOwedTF.setBounds(450,490,150,15);

        otherBillsLabel = new JLabel("Other bills:");
        otherBillsLabel.setBounds(610,490,200,15);
        otherBillsDSL = new JLabel("$");
        otherBillsDSL.setBounds(740,490,10,15);
        otherBillsTF = new JTextField();
        otherBillsTF.setBounds(750,490,150,15);
        //end of current liabilites

        //start of long term liabilites
        longTermLiabilitiesLabel = new JLabel("Long-Term:");
        longTermLiabilitiesLabel.setBounds(10,520,200,15);

        homeMortgageLabel = new JLabel("Home mortgage:");
        homeMortgageLabel.setBounds(30,550,200,15);
        homeMortgageDSL = new JLabel("$");
        homeMortgageDSL.setBounds(150,550,10,15);
        homeMortgageTF = new JTextField();
        homeMortgageTF.setBounds(160,550,150,15);

        homeEquityLoanLabel = new JLabel("Home equity loan:");
        homeEquityLoanLabel.setBounds(320,550,200,15);
        homeEquityLoanDSL = new JLabel("$");
        homeEquityLoanDSL.setBounds(440,550,10,15);
        homeEquityLoanTF = new JTextField();
        homeEquityLoanTF.setBounds(450,550,150,15);

        rentalPropertyMortgagesLabel = new JLabel("Rental mortgages:");
        rentalPropertyMortgagesLabel.setBounds(610,550,200,15);
        rentalPropertyMortgagesDSL = new JLabel("$");
        rentalPropertyMortgagesDSL.setBounds(740,550,10,15);
        rentalPropertyMortgagesTF = new JTextField();
        rentalPropertyMortgagesTF.setBounds(750,550,150,15);

        carLoansLabel = new JLabel("Car loans:");
        carLoansLabel.setBounds(30,570,200,15);
        carLoansDSL = new JLabel("$");
        carLoansDSL.setBounds(150,570,10,15);
        carLoansTF = new JTextField();
        carLoansTF.setBounds(160,570,150,15);

        studentLoansLabel = new JLabel("Student loans:");
        studentLoansLabel.setBounds(320,570,200,15);
        studentLoansDSL = new JLabel("$");
        studentLoansDSL.setBounds(440,570,10,15);
        studentLoansTF = new JTextField();
        studentLoansTF.setBounds(450,570,150,15);

        lifeInsuranceLoansLabel = new JLabel("Life insurance loans:");
        lifeInsuranceLoansLabel.setBounds(610,570,200,15);
        lifeInsuranceLoansDSL = new JLabel("$");
        lifeInsuranceLoansDSL.setBounds(740,570,10,15);
        lifeInsuranceLoanTF = new JTextField();
        lifeInsuranceLoanTF.setBounds(750,570,150,15);
        
        otherLongTermDebtLabel = new JLabel("Other debt:");
        otherLongTermDebtLabel.setBounds(30,590,200,15);
        otherLongTermDebtDSL = new JLabel("$");
        otherLongTermDebtDSL.setBounds(150,590,10,15);
        otherLongTermDebtTF = new JTextField();
        otherLongTermDebtTF.setBounds(160,590,150,15);
        //end of long term liabilites

        //start of total liabilites
        totalLiabilitesLabel = new JLabel("TOTAL LIABILITIES:");
        totalLiabilitesLabel.setBounds(10,620,200,15);
        totalLiabilitesDSL = new JLabel("$");
        totalLiabilitesDSL.setBounds(130,620,10,15);
        totalLiabilitesTF = new JTextField();
        totalLiabilitesTF.setBounds(140,620,150,15);
        totalLiabilitesTF.setEditable(false);
        //end of total liabilites
        //END OF LIABILITIES

        //START OF NET WORTH
        totalNetWorthLabel = new JLabel("NET WORTH:");
        totalNetWorthLabel.setBounds(10,650,200,15);
        totalNetWorthDSL = new JLabel("$");
        totalNetWorthDSL.setBounds(95,650,10,15);
        totalNetWorthTF = new JTextField();
        totalNetWorthTF.setBounds(105,650,150,15);
        totalNetWorthTF.setEditable(false);
        //END OF NET WORTH

        frame.add(nwc);
        frame.add(assetsLabel);
        frame.add(cashAndCashEquivalentsLabel);

        frame.add(checkingLabel);
        frame.add(checkingDollarSignLabel);
        frame.add(checkingTF);
        frame.add(savingsLabel);
        frame.add(savingsDollarSignLabel);
        frame.add(savingsTF);
        frame.add(moneyMarketAccountsLabel);
        frame.add(moneyMarketAccountsDollarSignLabel);
        frame.add(moneyMarketAccountsTF);
        frame.add(savingBondsLabel);
        frame.add(savingsBondsDollarSignLabel);
        frame.add(savingsBondTF);
        frame.add(cdsLabel);
        frame.add(cdsDollarSignLabel);
        frame.add(cdsTF);
        frame.add(cashValueLifeInsuranceLabel);
        frame.add(cashValueLifeInsuranceDollarSignLabel);
        frame.add(cashValueLifeInsuranceTF);
        
        frame.add(investedAssetsLabel);
        frame.add(brokerageLabel);
        frame.add(brokerageDSL);
        frame.add(brokerageTF);
        frame.add(iraLabel);
        frame.add(iraDSL);
        frame.add(iraTF);
        frame.add(rothiraLabel);
        frame.add(rothiraDSL);
        frame.add(rothiraTF);
        frame.add(fourZeroOneKLabel);
        frame.add(fourZeroOneKDSL);
        frame.add(fourZeroOneKTF);
        frame.add(sepiraLabel);
        frame.add(sepiraDSL);
        frame.add(sepiraTF);
        frame.add(keoghLabel);
        frame.add(keoughDSL);
        frame.add(keoughTF);
        frame.add(pensionLabel);
        frame.add(pensionDSL);
        frame.add(pensionTF);
        frame.add(annuityLabel);
        frame.add(annuityDSL);
        frame.add(annuityTF);
        frame.add(realestateLabel);
        frame.add(realestateDSL);
        frame.add(realestateTF);
        frame.add(solePropietorshipLabel);
        frame.add(solePropietorshipDSL);
        frame.add(solePropietorshipTF);
        frame.add(cCorporationLabel);
        frame.add(cCorporationDSL);
        frame.add(cCorporationTF);
        frame.add(sCorporationLabel);
        frame.add(sCorporationDSL);
        frame.add(sCorporationTF);
        frame.add(limitedLiabilityCompanyLabel);
        frame.add(limitedLiabilityCompanyDSL);
        frame.add(limitedLiabilityCompanyTF);
        frame.add(partnershipLabel);
        frame.add(partnershipDSL);
        frame.add(partnershipTF);
        frame.add(useAssetsLabel);
        frame.add(principalHomeLabel);
        frame.add(principalDSL);
        frame.add(principalTF);
        frame.add(vacationHomeLabel);
        frame.add(vacationHomeDSL);
        frame.add(vacationHomeTF);
        frame.add(vehiclesLabel);
        frame.add(vehiclesDSL);
        frame.add(vehiclesTF);
        frame.add(homeFurnishingLabel);
        frame.add(homeFurnishingDSL);
        frame.add(homeFurnishingTF);
        frame.add(collectiblesLabel);
        frame.add(collectiblesDSL);
        frame.add(collectiblesTF);
        frame.add(jewelryFursLabel);
        frame.add(jewelryFurstDSL);
        frame.add(jewelryFursTF);
        frame.add(totalAssetsLabel);
        frame.add(totalAssetsDSL);
        frame.add(totalAssetsTF);
        frame.add(liabilitiesLabel);
        frame.add(currentLiabilitiesLabel);
        frame.add(creditCardBalancesLabel);
        frame.add(creditCardBalancesDSL);
        frame.add(creditCardBalancesTF);
        frame.add(incomeTaxOwedLabel);
        frame.add(incomeTaxOwedDSL);
        frame.add(incomeTaxOwedTF);
        frame.add(otherBillsLabel);
        frame.add(otherBillsDSL);
        frame.add(otherBillsTF);
        frame.add(longTermLiabilitiesLabel);
        frame.add(homeMortgageLabel);
        frame.add(homeMortgageDSL);
        frame.add(homeMortgageTF);
        frame.add(homeEquityLoanLabel);
        frame.add(homeEquityLoanDSL);
        frame.add(homeEquityLoanTF);
        frame.add(rentalPropertyMortgagesLabel);
        frame.add(rentalPropertyMortgagesDSL);
        frame.add(rentalPropertyMortgagesTF);
        frame.add(carLoansLabel);
        frame.add(carLoansDSL);
        frame.add(carLoansTF);
        frame.add(studentLoansLabel);
        frame.add(studentLoansDSL);
        frame.add(studentLoansTF);
        frame.add(lifeInsuranceLoansLabel);
        frame.add(lifeInsuranceLoansDSL);
        frame.add(lifeInsuranceLoanTF);
        frame.add(otherLongTermDebtLabel);
        frame.add(otherLongTermDebtDSL);
        frame.add(otherLongTermDebtTF);
        frame.add(totalLiabilitesLabel);
        frame.add(totalLiabilitesDSL);
        frame.add(totalLiabilitesTF);
        frame.add(totalNetWorthLabel);
        frame.add(totalNetWorthDSL);
        frame.add(totalNetWorthTF);

        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new calc();
    }
}
