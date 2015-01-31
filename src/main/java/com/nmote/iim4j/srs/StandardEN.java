/*
 * Copyright (c) Nmote Ltd. 2004-2015. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.srs;

import java.util.Collection;

/**
 * StandardEN
 */
class StandardEN {

	public static void main(String[] args) {
		SubjectReferenceSystem srs = create();
		Collection<SubjectReference> c = srs.getChildren(srs.get("02001000"));
		for (SubjectReference ref : c) {
			System.out.println(ref + " " + srs.getName(ref));
		}
	}

	public static SubjectReferenceSystem create() {
		DefaultSubjectReferenceSystem srs = new DefaultSubjectReferenceSystem();
		srs.add("01000000", "arts, culture and entertainment",
				"Matters pertaining to the advancement and refinement of the human mind, of interests, skills, tastes and emotions");
		srs.add("01001000", "archaeology", "Probing the past through ruins and artefacts");
		srs.add("01002000", "architecture", "Designing of buildings, monuments and the spaces around them");
		srs.add("01003000", "bullfighting", "Classical contest pitting  man against  the bull");
		srs.add("01004000", "festive event (including carnival)",
				"Parades, parties, celebrations and the like not necessarily tied to a fixed occasion or date");
		srs.add("01005000", "cinema", "Stories related to cinema as art and entertainment");
		srs.add("01006000", "dance", "The expression of emotion or message through movement");
		srs.add("01007000", "fashion", "The design of clothing and accessories");
		srs.add("01008000", "language", "The means by which people communicate with each other");
		srs.add("01009000",
				"library and museum",
				"Edifices used to house collections of books, music, art, or objects from the past and present for public use and display");
		srs.add("01010000", "literature",
				"The use of pamphlets, books or other printed matter to convey ideas, stories or other messages for the public");
		srs.add("01010001", "fiction",
				"Structured stories that are usually not based on fact but are the creation of the authors imagination");
		srs.add("01011000", "music",
				"Expressing emotion or message through instruments or voice using different sounds, tones, harmonies and the like");
		srs.add("01011001", "classical music", "Music that follows classic structures of rhythm and harmony");
		srs.add("01011002", "folk music", "Music that developed from folk cultures, often based on story-telling");
		srs.add("01011003", "jazz music", "A music of diverse harmonics, often improvised");
		srs.add("01011004", "popular music", "The latest fad in music, generally aimed at the younger generation");
		srs.add("01011005", "country music",
				"Similar to folk but is unique to the United States and is less about story telling than about  loves sought and lost");
		srs.add("01011006", "rock and roll music", "Popular dance music developed in the 1950s");
		srs.add("01012000",
				"painting",
				"Using the mediums of oils, watercolour, pastel, pencils, chalk, crayon etc on various grounds to express emotion or message");
		srs.add("01013000",
				"photography",
				"Mechanical means of creating images of objects by use of light and light sensitive materials with chemicals or by digitals means");
		srs.add("01014000", "radio", "Stories related to radio as art and entertainment");
		srs.add("01015000", "sculpture", "Representation of forms in  clays, stone, woods, metals or other materials");
		srs.add("01016000", "television", "Stories related to television as art and entertainment");
		srs.add("01017000", "theatre",
				"Telling of a story or idea through dialogue, music and physical expression in a space or building designed for it");
		srs.add("01018000", "monument and heritage site",
				"Areas containing commemorative objects for historical people or events");
		srs.add("01018001",
				"institutions",
				"Either an established law, practice or system or an organization having a social, religious, educational or similar purpose such as hospital, school, prison");
		srs.add("01019000", "customs and tradition",
				"A particular way of behaving, or observances that have developed over time by a group of people");
		srs.add("01020000", "arts (general)",
				"The collective expression of message or emotion through music, literature, painting, theatre or other means");
		srs.add("01021000", "entertainment (general)",
				"The collective use of television, radio, theatre, music and the like for the amusement of people");
		srs.add("01022000", "culture (general)", "The ideas, customs, arts, skills of a particular group");
		srs.add("01023000", "nightclub",
				"A commercial establishment providing music, or other entertainment along with food and drink to selected clientele");
		srs.add("01024000", "cartoon", "Still images such as editorial cartoons and comic strips");
		srs.add("01025000",
				"animation",
				"Animation, including full-length and short cinema,  artists and merchandising of goods featuring animation characters.");
		srs.add("01026000", "mass media", "Television, radio, magazines, newspapers etc");
		srs.add("01026001", "periodicals",
				"Written material that is usually published weekly, bi-weekly, monthly or annually for a long time");
		srs.add("01026002",
				"news media",
				"Television, wire services, radio that collect facts about incidents, developing and presenting them to audiences as a whole story");
		srs.add("01026003", "newspapers",
				"Daily or weekly publications that present the day to day history of the world, as well as features, comics etc");
		srs.add("01026004", "reviews", "A critical look at someone else's work, whether film, theatre or writing");
		srs.add("01027000", "internet", "Stories related to Internet as art and entertainment");
		srs.add("02000000",
				"crime, law and justice",
				"Establishment and/or statement of the rules of behaviour in society, the enforcement of these rules, breaches of the rules and the punishment of offenders. Organizations and bodies involved in these activities.");
		srs.add("02001000", "crime", "Violation of established laws by individuals,  companies or organizations");
		srs.add("02001001", "homicide", "Killing of one person by another");
		srs.add("02001002", "computer crime", "Theft or destructive behaviour using a computer");
		srs.add("02001003", "theft", "Unlawful taking");
		srs.add("02001004", "drug trafficking", "Dealing in illicit often harmful substances");
		srs.add("02002000", "judiciary (system of justice)",
				"The system set up to deal with crime and those who do them");
		srs.add("02003000", "police", "Agents of the legal system set up enforce the laws");
		srs.add("02003001",
				"law enforcement",
				"Agencies involved in attempts to prevent disobedience to established laws, or to bring to justice those that disobey those laws");
		srs.add("02004000", "punishment", "The retribution handed out to those who break the laws");
		srs.add("02005000", "prison",
				"Also know as jails, lockups, calaboose, etc. for keeping law breakers from society");
		srs.add("02006000", "laws", "The codification of rules of behaviour");
		srs.add("02007000", "justice and rights", "The equitable administration of laws and regulations");
		srs.add("02007001", "civil rights", "Rights of individuals under civil law");
		srs.add("02008000", "trials",
				"The process by which guilt or innocence, or right or wrong is determined and adjudged");
		srs.add("02008001", "litigation", "Taking disputed issues to court for settlement by judge and/or jury");
		srs.add("02008002", "arbitration", "Resolution of disputed issues by a neutral panel");
		srs.add("02009000", "prosecution", "Stories regarding activities and investigations by public prosecutors.");
		srs.add("02010000", "organized crime", "Crimes committed by gangs or criminal groups.");
		srs.add("02011000", "international law",
				"The system of laws embraced by all nations, such as the Geneva Convention, the International Law of the Seas, etc.");
		srs.add("02011001",
				"international court or tribunal",
				"The activities of international tribunals such as European court for human rights, Hague tribunal, International Court of Justice etc");
		srs.add("02012000", "corporate crime", "Misdeeds of corporations and corporate officers");
		srs.add("02012001", "fraud", "Intentional deception that causes others to give up rights or property");
		srs.add("02012002", "embezzlement", "The intentional theft of money left in one's care");
		srs.add("02012003", "restraint of trade", "Interference in free competition in business and trade");
		srs.add("02012004", "breach of contract", "Rupture of legal agreements between companies, and with customers");
		srs.add("02012005", "anti-trust crime", "Violations of laws against monopolies");
		srs.add("02013000",
				"war crime",
				"Crimes committed during a war or armed conflict, usually against civilians or POW's, including the prosecution of such crimes");
		srs.add("03000000",
				"disaster and accident",
				"Man made and natural events resulting in loss of life or injury to living creatures and/or damage to inanimate objects or property.");
		srs.add("03001000", "drought", "A severe lack of water over a period of time");
		srs.add("03002000", "earthquake",
				"The shifting of the tectonic plates of the Earth, creating in some cases damage to structures");
		srs.add("03003000", "famine", "Severe lack of food for a large population");
		srs.add("03004000", "fire",
				"Ignition and consumption of materials through a combination of high heat and oxygen");
		srs.add("03005000", "flood",
				"Surfeit of water, caused by heavy rains or melting snow, usually in places where it's not wanted");
		srs.add("03006000", "industrial accident",
				"A mishap in a factory, a shop or an office, potentially harmful to humans");
		srs.add("03006001", "structural failures",
				"When a building, bridge or other structures collapse because of unexpected forces or poor design");
		srs.add("03007000", "meteorological disaster", "A weather-related disaster");
		srs.add("03007001",
				"windstorms",
				"A storm of high velocity but non-hurricane force movements of air with little or no rain or hail. Often highly destructive");
		srs.add("03008000", "nuclear accident", "A mishap involving radioactive materials");
		srs.add("03009000", "pollution", "Emissions of unwanted materials in areas where it can be harmful");
		srs.add("03010000", "transport accident", "An accident involving one or more vehicles");
		srs.add("03010001", "road accident", "Accidents on roads.");
		srs.add("03010002", "railway accident", "Accidents involving trains.");
		srs.add("03010003", "air and space accident", "Accidents involving craft in air or space.");
		srs.add("03010004", "maritime accident", "Accidents involving marine vessels.");
		srs.add("03011000", "volcanic eruption",
				"A rupture in the skin of the Earth allowing molten material to escape to the surface");
		srs.add("03012000", "relief and aid organisation",
				"Organizations set up to provide help to those in need because of lack of food, water or shelter");
		srs.add("03013000", "accident (general)", "Any unplanned event that causes unwanted consequences");
		srs.add("03014000", "emergency incident", "A sudden, unexpected event that requires immediate action");
		srs.add("03015000", "disaster (general)", "Serious or sudden misfortune");
		srs.add("03015001", "natural disasters",
				"Destructive incidents caused by the very nature of nature -- hurricanes, earthquakes, floods etc");
		srs.add("03016000", "emergency planning", "Planning for actions to deal with sudden, unplanned events");
		srs.add("04000000", "economy, business and finance",
				"All matters concerning the planning, production and exchange of wealth.");
		srs.add("04001000", "agriculture", "The process of producing natural materials for consumption");
		srs.add("04001001", "arable farming", "Production of food in the ground");
		srs.add("04001002", "fishing industry", "Raising or gathering of fish");
		srs.add("04001003", "forestry and timber",
				"Production and collection and preparation of wood products for future use");
		srs.add("04001004", "livestock farming", "Raising of animals for food");
		srs.add("04001005", "viniculture", "Production of wines from the vines to the finish products");
		srs.add("04002000", "chemicals", "Natural or manmade materials used to produce other materials");
		srs.add("04002001", "biotechnology",
				"The business of using engineering technology to study and solved problems of living organisms");
		srs.add("04002002", "fertiliser", "Natural or manmade materials used to encourage the growth of plants");
		srs.add("04002003", "health and beauty product",
				"Compilation of chemicals and other substances for use in enhancing ones looks or smell");
		srs.add("04002004", "inorganic chemical", "The branch of chemistry dealing with minerals and metals");
		srs.add("04002005", "organic chemical",
				"The branch of chemistry dealing with human, animal or carbon-based substances");
		srs.add("04002006", "pharmaceutical",
				"The production of medicines from various chemicals and natural substances");
		srs.add("04002007", "synthetic and plastic",
				"Chemicals used to produce plastics and other artificial substances to be used in manufacturing");
		srs.add("04003000", "computing and information technology", "NA");
		srs.add("04003001", "hardware", "NA");
		srs.add("04003002", "networking", "NA");
		srs.add("04003003", "satellite technology", "NA");
		srs.add("04003004", "semiconductors and active components", "NA");
		srs.add("04003005", "software", "NA");
		srs.add("04003006", "telecommunication equipment", "NA");
		srs.add("04003007", "telecommunication service", "NA");
		srs.add("04003008", "security",
				"To encompass technical developments in hardware and software, basic research and related areas such as cyber security");
		srs.add("04004000", "construction and property",
				"All items pertaining to the construction and sale of property");
		srs.add("04004001", "heavy construction",
				"Construction of roads, dams, office buildings, other large buildings");
		srs.add("04004002", "house building", "Construction of residences, for private use");
		srs.add("04004003", "real estate", "The buying and selling of properties of all types");
		srs.add("04004004",
				"farms",
				"Agricultural areas for the production of foodstuffs, including dairy products, fruits and livestock, such as cattle and fish");
		srs.add("04005000", "energy and resource",
				"Production of electrical power, and the water, air, sunlight, and fuels used to produce them");
		srs.add("04005001", "alternative energy", "Stories about the alternative energy business");
		srs.add("04005002", "coal",
				"Production and mining of anthracite and bituminous products for use in power production");
		srs.add("04005003", "oil and gas - downstream activities",
				"All matters concerning oil and gas, typically refining and distribution activities");
		srs.add("04005004", "oil and gas - upstream activities",
				"All matters concerning oil and gas, typically supply chain activities from the reservoir to the refinery gate");
		srs.add("04005005", "nuclear power", "Use of radioactive materials for power production");
		srs.add("04005006",
				"electricity production and distribution",
				"Primarily concerning the power line distribution system, but also the sale of electrical power at wholesale and retail levels");
		srs.add("04005007", "waste management and pollution control",
				"Stories about the business of waste management and pollution control");
		srs.add("04005008", "water supply", "Stories about the business of providing water for human use");
		srs.add("04005009",
				"natural resources (general)",
				"Articles about the general use of natural resources for business purposes, not focused on specific resources such as coal, oil, gas or water");
		srs.add("04005010", "energy (general)",
				"Articles about the energy industry, not focused on any specific sector");
		srs.add("04006000", "financial and business service",
				"Services  that transmit, safeguard, keep track of money or provide backup to commercial enterprises");
		srs.add("04006001", "accountancy and auditing",
				"Services provide balance sheet, budgets reconciliation and examine accuracy of financial statements");
		srs.add("04006002", "banking", "Services for storing, transmitting, receiving and delivery of cash moneys");
		srs.add("04006003", "consultancy service",
				"Providers of expert knowledge in a wide range of fields usually on a temporary, contract basis");
		srs.add("04006004", "employment agency", "A service helping people find jobs, and companies to find workers");
		srs.add("04006005", "healthcare provider",
				"Providers of medical services at all levels, including doctors, hospitals etc");
		srs.add("04006006",
				"insurance",
				"A risk taking venture that allows individuals to pay small amounts periodically to guard financially against unexpected events");
		srs.add("04006007", "legal service",
				"Lawyers and others who help companies and individuals deal with state, federal and local laws");
		srs.add("04006008", "market research", "A service that tries to determine what people want to buy");
		srs.add("04006009", "stock broking",
				"The buying and selling of company shares on behalf of individuals or other entities");
		srs.add("04006010", "personal investing", "Personal finance and investment");
		srs.add("04006011", "market trend", "Statistically significant consumer behaviour.");
		srs.add("04006012",
				"shipping service",
				"Companies that prepare and transport packages and documents for individuals or companies by any means, including postal services.");
		srs.add("04006013", "personal service",
				"Consumer service that is intangible e.g. beauty care as in hairdressing");
		srs.add("04006014", "janitorial service",
				"Companies that provide cleaning and similar services for homes and businesses.");
		srs.add("04006015", "funeral parlour and crematorium",
				"Companies that provide services for disposal of the dead");
		srs.add("04006016", "rental service",
				"Companies which provide rentals, including motor vehicles, tuxedos, tools, heavy equipment, and other supplies");
		srs.add("04006017", "wedding service", "Services and products related to the wedding industry");
		srs.add("04006018", "personal finance", "An individual's income and expenses");
		srs.add("04006019", "personal income", "Money that a person earns and is his/hers to keep or spend");
		srs.add("04007000", "consumer goods", "Items produced for and sold to individuals");
		srs.add("04007001", "clothing", "Items of apparel to wear");
		srs.add("04007002", "department store", "Stores largely devoted to the sale of clothing to individuals");
		srs.add("04007003", "food", "Fruits, vegetables, breads, meats for human consumption");
		srs.add("04007004", "mail order", "Items sold through and delivered by mail");
		srs.add("04007005", "retail", "The last stage in the sales chain");
		srs.add("04007006", "speciality store",
				"Retail outlets that specialize in categories such as shoes, coats, power tools, etc");
		srs.add("04007007", "wholesale", "The first link in the sales chain after production");
		srs.add("04007008", "beverage", "Liquid consumables, both alcoholic and non-alcoholic");
		srs.add("04007009", "electronic commerce", "Buying and selling items through the Internet");
		srs.add("04007010", "luxury good", "Leather bags, jewellery, haute couture, accessories etc");
		srs.add("04007011", "non-durable good", "Lighters, pens and stationery, tableware, watches, glasses etc");
		srs.add("04008000", "macro economics", "Broad scale economics and the world or national level");
		srs.add("04008001", "central bank",
				"A country's major bank that sets interest rates, and provides transfer of funds between commercial banks");
		srs.add("04008002", "consumer issue",
				"Those issues, such as prices, inflation/deflation, quality of goods, at the retail sales level");
		srs.add("04008003", "debt market", "NA");
		srs.add("04008004",
				"economic indicator",
				"Certain indexes, such as company inventories, the movement of prices that show whether the economy is improving or declining");
		srs.add("04008005",
				"emerging market",
				"Those markets that are struggling to enter the world economies and those requiring financial help from international lenders");
		srs.add("04008006", "foreign exchange market",
				"The trading of shekels, dinars, euros dollars etc around the world through regulated markets");
		srs.add("04008007", "government aid",
				"Supply of financial and other help by one government, usually to another");
		srs.add("04008008", "government debt",
				"The amount a government owes on bonds, services and for goods and services for which it has no ready cash");
		srs.add("04008009", "interest rate", "The amount of money one must pay to borrow money");
		srs.add("04008010", "international economic institution",
				"Entities such as UNIDO, World Bank, World Trade Organization, the Import-Expert Bank etc that deals at a world level");
		srs.add("04008011", "international (foreign) trade", "Trade of goods and services between nations");
		srs.add("04008012", "loan market",
				"The market where money is available to borrow, at certain rates of interest");
		srs.add("04008013", "economic organization",
				"Business, industrial and trade associations, societies and other private-sector groups.");
		srs.add("04008014", "consumer confidence", "Reports on consumer confidence in the economy.");
		srs.add("04008015", "trade dispute", "International dispute over trade barriers, cartels, dumping etc.");
		srs.add("04008016",
				"inflation and deflation",
				"An increase in the amount of money in circulation and thereby a rise in prices; deflation, tighter monetary policy causing lower prices");
		srs.add("04008017", "prices", "The monetary value of goods, services or stocks and bonds");
		srs.add("04008018", "currency values", "The value of one currency as measured against another");
		srs.add("04008019", "budgets and budgeting", "A method of balancing revenues against expenses");
		srs.add("04008020", "credit and debt",
				"Credit: the amount of money available to you, often by loan. Debt, the amount you owe.");
		srs.add("04008021",
				"loans",
				"An agreement by one individual or institution to temporarily disperse money to another, with an agreed rate and time for its return");
		srs.add("04008022",
				"mortgages",
				"The loan of money for the purpose of purchasing a property, whether land or building. Or, for homeowners to repair or maintain properties, often based on owner equity in a property");
		srs.add("04008023",
				"financial markets",
				"Institutions set up to trade the shares or other financial paper of companies or other organizations, can also include currency trading");
		srs.add("04008024", "commodity markets",
				"The bartering or trading of goods such as cotton, oil, coal, metals, etc");
		srs.add("04008025", "investments",
				"Speculative purchases of corporate instruments, of commodities, currencies, or parts thereof");
		srs.add("04008026", "stocks",
				"Corporate paper that gives an individual an ownership right to a part of a company's earnings");
		srs.add("04008027",
				"bonds",
				"Corporate or governmental paper representing the loan of money at a fixed rate and for a fixed time to that company or  government");
		srs.add("04008028", "mutual funds",
				"Pools of shares or bonds for sale often grouped by investment intention, such as growth, income or security");
		srs.add("04008029",
				"derivative securities",
				"Financial instruments such as futures, swaps and options, used for risk management, whose characteristics and value depend upon the characteristics and value of an underlying instrument, such as a commodity, bond, equity or currency.");
		srs.add("04008030", "imports", "What is bought abroad and brought into a country for resale");
		srs.add("04008031", "exports", "What is produced or manufactured in your country and sent and sold elsewhere");
		srs.add("04008032", "trade agreements",
				"Government level agreements between countries for the sale and purchase of goods and services");
		srs.add("04008033",
				"trade policy",
				"Governmental decisions on tariffs, shipping, embargoes, and the types or kinds of goods and services to be imported and exported");
		srs.add("04008034", "business enterprises",
				"Organizations set up usually for profit-making purposes by creating and selling a product or service");
		srs.add("04009000", "market and exchange",
				"Organized entities for buying and selling stocks, currencies, commodities and other goods");
		srs.add("04009001", "energy", "Stories related to energy trading and markets");
		srs.add("04009002", "metal", "Markets for trading base metals such as copper, aluminium, steel, zinc etc");
		srs.add("04009003", "securities", "Markets for trading types of company paper such as stocks and bonds");
		srs.add("04009004", "soft commodity", "Trading in commodities such as cotton, sugar, sorghum,  soybeans etc.");
		srs.add("04010000", "media", "The various means of disseminating news and information to the public");
		srs.add("04010001", "advertising",
				"Methods of promoting goods and service to consumers through video, graphics, print text etc");
		srs.add("04010002", "book", "The business of producing and selling bound media, whether fiction or non-fiction");
		srs.add("04010003", "cinema industry", "Stories related to the business of cinema");
		srs.add("04010004",
				"news agency",
				"Commercial agencies for production and distribution of newsworthy events through print, broadcast, video or electronic media");
		srs.add("04010005", "newspaper and magazine",
				"The business of producing bound and unbound printed paper products for periodic distribution of news items");
		srs.add("04010006", "online",
				"The business of distributing news and information through computer networks for public consumption");
		srs.add("04010007",
				"public relation",
				"The job of promoting products and services  through advertising campaigns and/or through person-to-person contact or through news releases");
		srs.add("04010008", "radio industry", "Stories related to the business of radio");
		srs.add("04010009", "satellite and cable service",
				"The business of transmitting  of news, entertainment and information via satellite or cable television services");
		srs.add("04010010", "television industry", "Stories related to the business of television");
		srs.add("04011000", "metal goods and engineering", "NA");
		srs.add("04011001", "aerospace", "NA");
		srs.add("04011002", "automotive equipment", "NA");
		srs.add("04011003", "defence equipment", "NA");
		srs.add("04011004", "electrical appliance", "NA");
		srs.add("04011005", "heavy engineering", "NA");
		srs.add("04011006", "industrial component", "NA");
		srs.add("04011007", "instrument engineering", "NA");
		srs.add("04011008", "shipbuilding", "NA");
		srs.add("04011009", "machine manufacturing", "NA");
		srs.add("04012000", "metal and mineral", "Production and refining of ores into metals");
		srs.add("04012001", "building material",
				"Manufacture of materials like wallboard, lumber wiring for the building industry");
		srs.add("04012002", "gold and precious material",
				"Mining, refining and sales of gold and other precious metals");
		srs.add("04012003", "iron and steel", "Mining, refining and sales of iron-based metals");
		srs.add("04012004", "non ferrous metal",
				"Mining, refining and sales of copper, zinc, aluminium, and other metals not based on iron");
		srs.add("04012005", "mining",
				"The industry of digging for metals, raw materials such as coal, or precious gems such as diamonds");
		srs.add("04013000", "process industry", "The business of turning raw materials into useable products");
		srs.add("04013001", "distiller and brewer", "Manufacture of alcoholic beverages");
		srs.add("04013002", "food", "The business of processing, distributing and selling for  basic human consumption");
		srs.add("04013003", "furnishings and furniture",
				"Manufacture of furniture, wallpaper, paints and fabrics for interior decoration");
		srs.add("04013004", "paper and packaging product",
				"Production of paper material for writing, wrapping, printing, or packaging");
		srs.add("04013005", "rubber product",
				"Production of rubber based materials for gloves, protective coatings, hoses and the like");
		srs.add("04013006", "soft drinks", "Production of non-alcoholic drinks");
		srs.add("04013007", "textile and clothing",
				"Production of fabrics for furnishings and fixtures, and for clothing of various types");
		srs.add("04013008", "tobacco", "Growing, producing and sale of tobacco products");
		srs.add("04014000", "tourism and leisure", "Stories about the tourism and leisure industries");
		srs.add("04014001",
				"casino and gambling",
				"The business of providing outlets for various games of chance using cards, dice, spinning wheels to betting on animal races");
		srs.add("04014002", "hotel and accommodation", "The business of providing food and shelter to travellers");
		srs.add("04014003", "recreational and sporting goods", "Manufacture of goods for leisure activities");
		srs.add("04014004", "restaurant and catering",
				"The business of providing prepared foods for customers in groups large and small");
		srs.add("04014005", "tour operator", "Operators of trips either locally, as around town, or to other countries");
		srs.add("04015000", "transport", "The means of getting from one place to the other without walking");
		srs.add("04015001", "air transport", "Airplane and airport operations");
		srs.add("04015002", "railway", "The business of transporting people or cargo by rail");
		srs.add("04015003", "road transport", "The business of transport goods by trucks and highways");
		srs.add("04015004", "waterway and maritime transport",
				"Commercial movement of people or goods via boats, ships and water");
		srs.add("04016000", "company information", "Information about individual companies or business entities");
		srs.add("04016001", "accounting and audit",
				"Changes in choice of auditing firm. Reports on impact of changes in GAAP.");
		srs.add("04016002", "annual and special corporate meeting",
				"Announcements of upcoming meetings. Reports on meetings.");
		srs.add("04016003", "annual report", "Stories regarding availability or contents of annual company reports.");
		srs.add("04016004", "antitrust issue", "Stories regarding antitrust activities, monopoly regulation, etc.");
		srs.add("04016005", "merger, acquisition and takeover", "News on mergers, takeovers or acquisitions.");
		srs.add("04016006", "analysts' comment",
				"Stories containing stock analyst comments, analysis and recommendations.");
		srs.add("04016007", "bankruptcy", "News about actual bankruptcy filings.");
		srs.add("04016008", "board of directors (appointment and change)",
				"News regarding appointments to or changes in the board of directors for a company.");
		srs.add("04016009", "buyback",
				"News regarding stock buyback programs. This should be kept distinct from Stock Activity (see below).");
		srs.add("04016010", "C.E.O. interview", "Interviews with Chief Executive Officers.");
		srs.add("04016011", "corporate officer", "Appointments or changes in corporate officers.");
		srs.add("04016012", "corporate profile", "Stories that contain descriptive profiles of companies.");
		srs.add("04016013", "contract", "News about commercial contracts.");
		srs.add("04016014", "defence contract", "The award of government contracts for defence related activity.");
		srs.add("04016015", "dividend announcement", "Announcements regarding the disbursement of dividends.");
		srs.add("04016016", "earnings forecast", "Analyst prediction of company earnings.");
		srs.add("04016017", "financially distressed company",
				"News that a company is financially distressed - not yet having filed for bankruptcy.");
		srs.add("04016018", "earnings", "Any release of earnings results.");
		srs.add("04016019", "financing and stock offering",
				"Stories regarding new offerings of equity including initial public offerings.");
		srs.add("04016020", "government contract", "The award of government contracts not related to defence activity");
		srs.add("04016021", "global expansion",
				"Planned or actual openings of offices in countries for the first time.");
		srs.add("04016022", "insider trading",
				"Reports on the purchase or sales of stock by corporate officers or board members.");
		srs.add("04016023", "joint venture",
				"News regarding joint ventures between companies. (Not marketing related - see Marketing.)");
		srs.add("04016024", "leveraged buyout", "News about leveraged buyouts.");
		srs.add("04016025", "layoffs and downsizing", "Planned or actual reductions in the labour force.");
		srs.add("04016026", "licensing agreement", "Stories about licensing agreements between companies.");
		srs.add("04016027", "litigation and regulation",
				"Stories regarding corporate law including litigation and regulations.");
		srs.add("04016028", "management change",
				"Major appointments or changes in management below the level of corporate officer.");
		srs.add("04016029",
				"marketing",
				"Includes news regarding joint marketing agreements between companies, adoption of new product marketing strategies, etc.");
		srs.add("04016030", "new product", "Announcements of new products.");
		srs.add("04016031", "patent, copyright and trademark", "News related to patents, copyright and trademarks.");
		srs.add("04016032", "plant closing", "Announcements of planned or actual plant closings.");
		srs.add("04016033", "plant opening", "Announcements of planned or actual plant openings.");
		srs.add("04016034", "privatisation",
				"Stories regarding the privatisation (privatisation) of state run companies.");
		srs.add("04016035", "proxy filing",
				"Filings with regulatory agencies of proxy statements for upcoming shareholder votes.");
		srs.add("04016036", "rating", "Corporate and sovereign debt and credit ratings (e.g. SandP or Moody's)");
		srs.add("04016037", "research and development",
				"News about research and expenditure on new product development.");
		srs.add("04016038", "quarterly or semiannual financial statement",
				"Stories regarding the availability or contents of quarterly or semi-annual corporate reports.");
		srs.add("04016039", "restructuring and recapitalisation",
				"Stories involving the sale of company units, splits of existing companies into units under a holding company, etc.");
		srs.add("04016040", "spin-off",
				"Stories regarding the creation of new companies being spun off from existing companies.");
		srs.add("04016041", "stock activity",
				"Announcements of major stock events: splits, block trades, new highs or lows, etc.");
		srs.add("04016042", "industrial production", "Manufacture of durable and non-durable goods");
		srs.add("04016043", "productivity",
				"The cost of labour to produce an item of value, often measured as output per hour per person");
		srs.add("04016044", "inventories", "Goods not sold and held by the producer, wholesaler or retailer");
		srs.add("04016045",
				"sales",
				"Either the exchange of goods for money, or the practice of discounting prices to increase the amount of goods sold, or to get rid of outdated merchandise");
		srs.add("04016046", "corporations",
				"Business enterprises formally licensed with boards of directors and hierarchical structures of governance");
		srs.add("04016047",
				"shareholders",
				"Anyone holding a piece of paper issued by a company which changes in value and entitles them to dividends depending on the performance of the company");
		srs.add("04016048",
				"corporate performance",
				"How well a company performs, measured by its net earnings, its dividends its earnings per share and price/earnings ratio");
		srs.add("04016049", "losses", "When expenses exceed revenue");
		srs.add("04016050",
				"credit ratings",
				"Formal statements by certain rating agencies such as Standard and Poor's on the investment risk of a company, a country or enterprise");
		srs.add("04016051",
				"stock splits",
				"Issuing multiple shares for one share of stock. Usually occurs when the price of a stock has increased so much that its purchase price is not attractive. A reverse split is when one share is issued for multiple shares, to raise the per share value.");
		srs.add("04016052", "stock options", "An agreement to either buy or sell a stock when it meets a certain price");
		srs.add("04016053", "recalls (products)", "A decision by a company to take back or repair a defective product");
		srs.add("04016054", "globalization", "Doing business around the world");
		srs.add("04016055", "consumers", "Buyers of goods and services");
		srs.add("04017000", "economy (general)", "Content of a general nature about trade and the economy");
		srs.add("04017001",
				"economic policy",
				"Government directed policy on production, taxes, tariffs  and things that affect the direction and health of the economy");
		srs.add("04018000", "business (general)", "Content of a general nature about business");
		srs.add("04019000", "finance (general)", "Content of a general nature about finance");
		srs.add("04019001", "money and monetary policy",
				"Government bank directed policy on the amount of money in circulation and the rate at which it can be loaned");
		srs.add("05000000", "education",
				"All aspects of furthering knowledge of human individuals from birth to death.");
		srs.add("05001000", "adult education",
				"Education provided for older students outside the usual age groups of 5-25");
		srs.add("05002000", "further education", "Any form of education beyond basic education of several levels");
		srs.add("05003000", "parent organisation", "Groups of parents set up to support schools");
		srs.add("05004000", "preschool", "Education for children under the national compulsory education age");
		srs.add("05005000", "school", "A building or institution in which education of various sorts is provided");
		srs.add("05005001", "elementary schools",
				"Schools usually of a level from kindergarten through 11 or 12 years of age");
		srs.add("05005002", "middle schools",
				"Transitional school between elementary and high school, 12 through 13 years of age");
		srs.add("05005003", "high schools",
				"Pre-college/ university level education, 14 to 17 or 18 years of age, called freshman, sophomore, junior and senior");
		srs.add("05006000", "teachers union", "Organization of teachers for collective bargaining and other purposes");
		srs.add("05007000", "university", "Institutions of higher learning capable of providing doctorate degrees");
		srs.add("05008000", "upbringing", "Lessons learned from parents and others as one grows up");
		srs.add("05009000",
				"entrance examination",
				"Exams for entering colleges, universities, junior and senior high schools, and all other higher and lower education institutes, including cram schools, which help students prepare for exams for entry to prestigious schools.");
		srs.add("05010000", "teaching and learning", "Either end of the education equation");
		srs.add("05010001", "students",
				"People of any age in a structured environment, not necessarily a classroom, in order to learn something");
		srs.add("05010002", "teachers", "People with knowledge who can impart that knowledge to others");
		srs.add("05010003", "curriculum",
				"The courses offered by a learning institution and the regulation of those courses");
		srs.add("06000000", "environmental issue",
				"All aspects of protection, damage, and condition of the ecosystem of the planet earth and its surroundings.");
		srs.add("06001000", "renewable energy",
				"Stories about the environmental impact of renewable energy, including solar, wind, hydro, biomass and geothermal");
		srs.add("06002000", "conservation",
				"Stories about preservation of wilderness areas, flora and fauna, including species extinction");
		srs.add("06002001", "endangered species",
				"Those species of wildlife in danger of disappearing, largely because of changes in environment, hunting, or weather");
		srs.add("06003000", "energy saving", "Conservation of electrical, and other power  sources");
		srs.add("06004000", "environmental politics", "The debate on environmental policy");
		srs.add("06005000", "environmental pollution", "Corruption of air, water, land etc. by  harmful substances");
		srs.add("06005001", "air pollution", "Solid or gaseous matter affecting the quality of air that we breathe");
		srs.add("06005002", "water pollution",
				"Solids or liquids that corrupt the quality of water that could be used for drinking or irrigation");
		srs.add("06006000", "natural resources",
				"Stories about the environmental issues related to the exploitation of natural resources for human use");
		srs.add("06006001",
				"land resources",
				"That portion of a nation or state that is above water and available for development either for profit or for the general good of the public");
		srs.add("06006002",
				"parks",
				"Areas set aside and developed for public enjoyment and recreation, including commercial development such as theme parks");
		srs.add("06006003", "forests",
				"Open areas of trees either available for public enjoyment, or for commercial purposes");
		srs.add("06006004",
				"wetlands",
				"Areas generally marshy and not either under water or dry land. Often related to aquifers for water quality and/or wildlife");
		srs.add("06006005",
				"mountains",
				"Elevated land masses formed over the ages either by erosion, volcanic eruption, or movement of massive geographical formations called plates");
		srs.add("06006006",
				"rivers",
				"Moving water areas bounded by land that extend from earth sources and meander through land areas to join with other water areas. In smaller forms they are creeks, rivulets, streams etc");
		srs.add("06006007", "oceans",
				"Salt water masses separating continents or other major geographical masses. smaller forms are seas or lakes or ponds");
		srs.add("06006008", "wildlife", "All forms of animal life that have not been domesticated");
		srs.add("06006009", "energy resources",
				"Such resources as coal, gas, wind, sunlight etc., used to generate heat, electricity and power");
		srs.add("06007000", "nature", "Taken as a whole the natural environment of flora and fauna");
		srs.add("06008000", "population", "People and their growth and development within a natural setting");
		srs.add("06009000", "waste", "Stories about the environmental impact of waste, including recycling efforts");
		srs.add("06010000",
				"water",
				"Stories concerning environmental issues about bodies of water, including oceans, lakes, streams and reservoirs, as well as ice, glaciers and forms of precipitation");
		srs.add("06011000",
				"global warming",
				"This category includes all issues relating to global warming including temperature research, remote sensing on temperature trends, debate on global warming, ways to reduce emissions and carbon trading.");
		srs.add("06012000",
				"hazardous materials",
				"Materials that are harmful to humans or animals if they are exposed to them. Includes radiation, poison gases, chemicals, heavy metals, PCBs, and certain plant products");
		srs.add("06013000",
				"environmental cleanup",
				"Processes whereby contaminated areas are cleaned of hazardous materials so they can be inhabited again by either people or animals.");
		srs.add("07000000", "health", "All aspects pertaining to the physical and mental welfare of human beings.");
		srs.add("07001000", "disease", "Any harmful or destructive condition");
		srs.add("07001001", "communicable diseases",
				"Diseases that can be transmitted from one person or animal to another");
		srs.add("07001002", "virus diseases", "Diseases caused by infection within cells by viruses");
		srs.add("07001003", "AIDS",
				"Acquired Immunity Deficiency Syndrome, an incurable disease caused by the human immunodeficiency virus");
		srs.add("07001004", "cancer", "A serious and often fatal disease caused when normal cells mutate into tumours");
		srs.add("07001005", "heart disease",
				"A degenerative and serious disease caused by narrowing of the arteries feeding the heart");
		srs.add("07001006", "alzheimer's disease", "A disorder of the brain leading to dementia");
		srs.add("07001007", "animal diseases", "Disorders affecting animals that do not necessarily endanger humans");
		srs.add("07001008", "plant diseases",
				"Disorders affecting plants caused either by parasites or environmental factors");
		srs.add("07002000",
				"epidemic and plague",
				"An epidemic is a rapidly spreading condition in a community and a plague is usually a deadly disease of epidemic proportions");
		srs.add("07003000", "health treatment",
				"In general treatment of diseases and other conditions to produce wellness");
		srs.add("07003001", "prescription drugs", "Drugs that can be purchased only with a doctor’s authorization");
		srs.add("07003002", "dietary supplements", "Nutrients taken in addition to food to bolster health");
		srs.add("07004000",
				"health organisations",
				"Includes stories about specific health organizations, including professional associations, non-profits and international groups");
		srs.add("07005000", "medical research", "Investigation into the causes and cures of diseases");
		srs.add("07006000", "medical staff", "Doctors, nurses, interns and others in a medical facility");
		srs.add("07007000", "medicine",
				"A substance used with the expectation that it will eliminate disease or illness");
		srs.add("07007001", "herbal",
				"Treatment based on the use of herbs and other plants to cure or alleviate disease symptoms");
		srs.add("07007002", "holistic",
				"Treatment of the whole person including mental and social factors rather than just the symptoms of the disease.");
		srs.add("07007003",
				"western",
				"The practice of diagnosis, treatment and prevention of disease based on modern scientific research in the western hemisphere.");
		srs.add("07007004", "traditional Chinese",
				"The practice of diagnosis, treatment and prevention of disease based on traditional methods developed in the orient.");
		srs.add("07008000", "preventative medicine", "Substances used to prevent diseases or illnesses");
		srs.add("07008001", "vaccines", "Medications designed to create immunity to diseases");
		srs.add("07009000", "injury", "A traumatic condition of the human body caused usually by  outside forces");
		srs.add("07010000", "hospital and clinic", "Medical facilities for the treatment of illnesses and injury");
		srs.add("07011000", "government health care", "Health care provided by national governments");
		srs.add("07011001", "medicare", "A program of the U.S. government to provide health care to senior citizens");
		srs.add("07011002", "medicaid",
				"A program of the U.S. government to provide health care to needy citizens of all ages");
		srs.add("07012000", "private health care", "Health care provided by privately funded or insured organizations");
		srs.add("07013000",
				"healthcare policy",
				"Health-related policy decisions including what different countries are doing regarding prescription drug policies, AIDS, psychiatric care, health care funding and related topics.");
		srs.add("07013001", "food safety", "Issues relating to food cleanliness and contamination");
		srs.add("07014000", "medical specialisation", "The different medical specialist areas.");
		srs.add("07014001",
				"geriatric",
				"Research into aging and age-related issues including age-related illnesses, medical research, trends, geriatric medicine and related topics like age discrimination and health insurance for an ageing population.");
		srs.add("07014002",
				"pediatrics",
				"Research and medicine specifically for the young - includes premature babies, infant care, childhood disease and treatment - also teen-related health and behaviour problems.");
		srs.add("07014003",
				"reproduction",
				"This would include reproductive technologies like invitro fertilization and cloning as well as related debates. Sexual development matters and sexually transmitted diseases would also fall under this category.");
		srs.add("07014004",
				"genetics",
				"The science and research into genetic-base disease and cures for disease. This would include proteomics (the study of what proteins are produced by which genes and what those proteins do), general genetics and stem-cell research.");
		srs.add("07015000", "medical service",
				"medical support for doctors, including blood tests and other medical tests on individuals, X-rays CAT scans MRIs etc.");
		srs.add("07016000", "physical fitness", "The condition of a person's cardio-vascular and muscular health.");
		srs.add("08000000", "human interest", "Lighter items about individuals, groups, animals or objects.");
		srs.add("08001000", "animal", "Stories involving animals of all types");
		srs.add("08002000", "curiosity", "Stories of  an unusual nature that can raise questions or amuse");
		srs.add("08003000", "people", "Unusual stories about people of all levels");
		srs.add("08003001", "advice", "Letters and answers about personal problems that are publishable");
		srs.add("08003002", "celebrity",
				"News about celebrities, i.e. Madonna has a baby, Elton John sues his accountants etc.");
		srs.add("08004000", "mystery", "Something unexplained or unknown");
		srs.add("08005000", "society", "Stories of well-known people");
		srs.add("08006000", "award and prize",
				"Decorations, awards and prizes, including those given by the government.");
		srs.add("08007000", "imperial and royal matters",
				"News on imperial and royal family members, including matters on legal systems.");
		srs.add("09000000",
				"labour",
				"Social aspects, organizations, rules and conditions affecting the employment of human effort for the generation of wealth or provision of services and the economic support of the unemployed.");
		srs.add("09001000", "apprentices",
				"People who are in the work force at a learning level, serving under a master");
		srs.add("09002000", "collective contract", "Usually written contracts covering a specific class of worker");
		srs.add("09003000", "employment", "Paid labour");
		srs.add("09003001", "labor market", "A pool of people who are working or are seeking work");
		srs.add("09003002", "job layoffs",
				"The reduction of a company's work force through dismissal because of changing economic factors");
		srs.add("09003003", "child labor", "Employment of children, usually under the age of 18");
		srs.add("09003004",
				"occupations",
				"Generally one's trade, profession or business although professions are usually such things as lawyers and doctors, and occupations are such as clerks or truckers");
		srs.add("09004000", "labour dispute", "Differences of opinion about work conditions, pay, etc");
		srs.add("09005000", "labour legislation", "Laws governing work and labour");
		srs.add("09006000", "retirement", "The years after work");
		srs.add("09007000", "retraining",
				"Providing a worker training in new skills when his old skills are no longer applicable");
		srs.add("09008000", "strike", "A job action involving cessation of work");
		srs.add("09009000", "unemployment", "Lack of paid work");
		srs.add("09010000", "unions", "Groups established to represent bodies of workers");
		srs.add("09011000", "wage and pension", "Parts of a salary divided for current income and future income");
		srs.add("09011001",
				"employee benefits",
				"Either benefits provided to an employee by a company, such as pensions, health insurance; or monetary compensation paid by a government to the jobless usually called unemployment benefits");
		srs.add("09011002",
				"social security",
				"FICA. Money paid by individual and companies into a government account to be paid out when that individual  reaches a certain age");
		srs.add("09012000", "work relations", "The give and take between management and labour");
		srs.add("09013000", "health and safety at work", "Rules and procedures for guaranteeing the health of workers");
		srs.add("09014000", "advanced training", "Additional training to enhance current skills");
		srs.add("09015000", "employer",
				"The person who employs workers and pays the salaries and other benefits to workers");
		srs.add("09016000", "employee", "A person who trades his time and talent for money and other benefits");
		srs.add("10000000", "lifestyle and leisure",
				"Activities undertaken for pleasure, relaxation or recreation outside paid employment, including eating and travel.");
		srs.add("10001000", "game", "Contests generally for ones amusement");
		srs.add("10001001", "Go", "Japanese Chess.");
		srs.add("10001002",
				"chess",
				"A game played on a checkered board with 16 pieces to each side with specific ranges of movement depending on their identity");
		srs.add("10001003", "bridge",
				"A card game of four players who bet on the hands of each other, developed from Russian whist");
		srs.add("10002000", "gaming and lottery",
				"Gambling, often involving selection of sets of numbers one expects to come up");
		srs.add("10003000", "gastronomy", "The art of good eating");
		srs.add("10003001", "organic foods",
				"Food which is grown using no artificial fertilizers or chemical compounds");
		srs.add("10004000", "hobby",
				"Various types of activities for amusement, such as collecting stamps, building models, quilting, crafts");
		srs.add("10005000", "holiday or vacation",
				"Stories about leisure travel to a single location and/or country over a short period of time");
		srs.add("10006000",
				"tourism",
				"Stories about leisure travel involving visits to a number of locations and/or countries over an extended period of time, often as part of an organized group");
		srs.add("10007000", "travel and commuting",
				"Stories about transport options, travel networks, commuting, car pooling and business travel");
		srs.add("10007001", "traffic", "Traffic reports and/or warnings");
		srs.add("10008000", "club and association", "Organizations joined by individuals because of similar interests");
		srs.add("10009000", "lifestyle (house and home)", "Unique culture of ones own home");
		srs.add("10010000", "leisure (general)", "Activities  carried out in ones' spare time");
		srs.add("10011000", "public holiday", "A day or days set off for celebration");
		srs.add("10012000", "hunting",
				"An activity involving the use of  weapons or traps for the capturing of animals");
		srs.add("10013000", "fishing",
				"An activity involving the use of baits, lures, weapons and traps for the capture of aquatic species");
		srs.add("10014000", "auto trends", "The evolution of the automobile");
		srs.add("11000000",
				"politics",
				"Local, regional, national and international exercise of power, or struggle for power, and the relationships between governing bodies and states.");
		srs.add("11001000", "defence", "Anything involving the defence of one's own country");
		srs.add("11001001", "veterans affairs", "Care and provision for those who served in the military");
		srs.add("11001002", "national security",
				"The philosophy of securing a nation and its borders, as well as the well being of its citizens");
		srs.add("11001003", "security measures",
				"Means of making a nation, a state, a building or a person secure from harm and outside interference.");
		srs.add("11001004", "armed Forces",
				"Those employed by a government to conduct war, or to enforce the security of a nation");
		srs.add("11001005", "military equipment", "Equipment issued to members of the armed forces");
		srs.add("11001006", "firearms",
				"Anything that uses an explosive in a directed manner to propel an object that can maim or kill");
		srs.add("11001007", "biological and chemical weapons",
				"Devices using biological agents, or chemical mixtures to disable, maim or kill an opponent");
		srs.add("11001008",
				"missile systems",
				"Anything that propels an inert, explosive, biological or chemical object through the air with the aim of disabling, maiming or killing an opponent.");
		srs.add("11001009", "nuclear weapons",
				"Weapons that use controlled radioactivity from the decay of certain elements to disable, maim or kill an opponent");
		srs.add("11002000", "diplomacy",
				"The use of verbal and written skills for persuading others to your point of view");
		srs.add("11002001",
				"summit",
				"Includes meetings of leaders, foreign and finance ministers from the Group of Eight major nations and Group of Seven industrialized nations.");
		srs.add("11003000", "election", "The selection of representatives by the casting of votes");
		srs.add("11003001", "political candidates", "Individuals who are chosen to stand for office");
		srs.add("11003002", "political campaigns", "Campaigns for public office");
		srs.add("11003003", "campaign finance", "The money that makes campaigns for public office possible");
		srs.add("11003004", "national elections", "Choosing individuals for government at a national level");
		srs.add("11003005", "regional elections", "Choosing individuals for government at a regional  level");
		srs.add("11003006", "local elections",
				"Choosing individuals for government at the basic level, whether city, village or county");
		srs.add("11003007", "voting",
				"The act of selecting an individual you would like to represent your interests in government");
		srs.add("11004000", "espionage and intelligence", "Covert collection of information");
		srs.add("11005000", "foreign aid", "Help provided by one nation to another");
		srs.add("11006000", "government", "The system for ruling a country");
		srs.add("11006001",
				"civil and public service",
				"The paid service by civilians for the government, and the often non-paid service of individuals for the benefit of others (public service)");
		srs.add("11006002", "safety of citizens", "Government policies to protect the well being of its citizens");
		srs.add("11006003", "think tank",
				"Group that undertakes political research and issue position papers, recommendations etc");
		srs.add("11006004", "national government", "The ruling body of a nation");
		srs.add("11006005", "executive (government)",
				"That portion of a ruling body involving the overall operation of government");
		srs.add("11006006", "heads of state",
				"Symbolic or actual chief representative of a nation, such as royalty, or president or emir, for example");
		srs.add("11006007", "government departments",
				"Divisions of a government that concentrate on specific areas such as health, welfare, economy or war");
		srs.add("11006008", "public officials",
				"Individuals, usually elected, who are in public service or commonly in the public eye.");
		srs.add("11006009",
				"ministers (government)",
				"Heads of various government departments at one level, also known as secretaries. At another level they form a legislative body. The chief minister is either prime minister or premier.");
		srs.add("11006010", "public employees", "People employed by a government at all levels");
		srs.add("11006011", "privatisation", "The privatisation of state-owned companies or property");
		srs.add("11006012", "nationalisation", "State takeover of private companies or property");
		srs.add("11007000", "human rights", "Rights entitled to be enjoyed by all citizens universally");
		srs.add("11008000", "local authority", "Authorities at city, county state or borough level");
		srs.add("11009000", "parliament", "The collective body of elected officials representing the people");
		srs.add("11010000", "parties and movements",
				"Covers both formally recognized and informal political associations");
		srs.add("11010001",
				"non government organizations (NGO)",
				"Groups officially outside of government that lobby, demonstrate or campaign on a wide range of issues such as economics, environment healthcare etc.");
		srs.add("11011000", "refugee",
				"A person seeking shelter in another country because of some fear of persecution in his own country");
		srs.add("11012000", "regional authority",
				"Government bodies at levels encompassing more than one jurisdiction, e.g. the Delaware River Basin Commission");
		srs.add("11013000", "state budget and tax", "The national budget as promulgated by the government");
		srs.add("11013001", "public finance",
				"The money of government used for paying for public programs and services and public debt");
		srs.add("11014000", "treaty and international organisation",
				"Formal bodies to regulate activities between nation states, often on the basis of written agreements");
		srs.add("11014001", "international relations",
				"Non-violent relations between nations through negotiation, treaty, or personal meetings");
		srs.add("11014002", "peace negotiations", "Negotiations intended to bring an end to a conflict");
		srs.add("11014003", "alliances",
				"Coalitions of like-minded groups formed to present a stronger force against any challenges");
		srs.add("11015000", "constitution",
				"Usually a written document setting forth the operations of a government and the rights of the citizens therein");
		srs.add("11016000", "interior policy", "Government policies affecting internal affairs of a country");
		srs.add("11016001", "data protection",
				"Efforts to protect personal information in either written, oral or electronic form");
		srs.add("11016002", "housing and urban planning",
				"Systematic planning of urban and suburban areas and the housing within those areas");
		srs.add("11016003",
				"pension and welfare",
				"Government policies affecting the well being of its citizens through unemployment benefits, state pensions and other similar payments");
		srs.add("11016004",
				"personal weapon control",
				"Government control of personal ownership of firearms and other offensive weapons, including control of weapons used for sports through licenses and other means");
		srs.add("11017000", "migration", "Movement of one body of persons from one place to another");
		srs.add("11018000",
				"citizens initiative and recall",
				"Political suggestions by non-government officials for corrective action, or for changes in existing rules and regulations");
		srs.add("11019000", "referenda",
				"Political proposals, laws and actions suggested by non-government officials to be voted on by the entire voting body");
		srs.add("11020000", "nuclear policy",
				"Government policies as regards to use of nuclear fuels for power production or weapons");
		srs.add("11021000",
				"lobbying",
				"The attempt by non-government bodies and individual to affect the outcome of legislation through verbal, or other, persuasion");
		srs.add("11022000",
				"regulatory policy and organisation",
				"The rules and bodies, both national and international, that govern conflict of interest and good practice regulations.");
		srs.add("11023000",
				"censorship",
				"Attempts by any group to control freedoms of speech, religion,  and ideas distributed in print, graphics, cyberspace and other ways. Does not include official standards such as cinema ratings, advertising and  broadcast standards.");
		srs.add("11024000", "politics (general)",
				"The art or science of participating in the affairs of government, a state of political party");
		srs.add("11024001", "political systems", "Systems designed to provide order to government");
		srs.add("11024002", "democracy",
				"Government in which the people hold the power either directly, or through elected officials.");
		srs.add("12000000", "religion and belief",
				"All aspects of human existence involving theology, philosophy, ethics and spirituality.");
		srs.add("12001000", "cult and sect",
				"Offshoots of established religious bodies, or small narrow-focused group promulgated by one or two individuals");
		srs.add("12002000", "belief (faith)", "The established beliefs of an individuals religion");
		srs.add("12002001", "unificationism",
				"Those who believe that Rev. Moon completed Jesus' task of bringing God's peace on mankind.");
		srs.add("12002002",
				"scientology",
				"Believe that man is a spiritual being endowed with abilities well beyond those which he normally envisages; he's able to solve his own problems, accomplish his goals and gain lasting happiness.");
		srs.add("12003000", "freemasonry",
				"A secret international society based on the principles of brotherhood, charity and mutual aid");
		srs.add("12004000", "religion", "Established theologies with fixed systems of belief");
		srs.add("12004001", "christianity", "Those that use Jesus Christ and his teachings as their centre of belief");
		srs.add("12004002", "islam", "Those who use Allah and his teachings as their centre of belief");
		srs.add("12004003",
				"judaism",
				"A group believing in one god, basing their beliefs on written scriptures and the Talmud, including the second coming of the Messiah");
		srs.add("12004004",
				"buddhism",
				"A major Asian religion founded by Buddha in the 6th century in India and preaching that right thinking and self denial will lead to a divine state without desire");
		srs.add("12004005", "hinduism",
				"A religious and social system, believing in a caste system with the Brahmans the highest and untouchables the lowest.");
		srs.add("12005000", "church (organisation)",
				"Generally an edifice identifiable as a place of worship for the Christian religion");
		srs.add("12005001", "religious facilities",
				"Any facility where a group can carry out its religious rites whether it is a mosque, a church, a house or a tent");
		srs.add("12006000", "values", "Personal levels of social behaviour");
		srs.add("12006001", "ethics", "A system of beliefs about acceptable behaviour");
		srs.add("12006002", "corrupt practices", "Any action which is harmful to others");
		srs.add("12007000", "church and state relations",
				"The legal and social division between religious institutions and the affairs of state");
		srs.add("12008000", "philosophy", "Different thoughts about the way the world works");
		srs.add("13000000",
				"science and technology",
				"All aspects pertaining to human understanding of nature and the physical world and the development and application of this knowledge");
		srs.add("13001000",
				"applied science",
				"Stories about putting scientific knowledge to practical uses in the fields of the medical sciences, agriculture, domestic sciences as well as trades and crafts");
		srs.add("13001001", "physics", "The study of the properties and changes of matter");
		srs.add("13001002", "chemistry", "The study of the composition and reaction of substances");
		srs.add("13002000",
				"engineering",
				"Stories about putting scientific knowledge to practical uses in the fields of civil, electrical, mechanical and chemical engineering");
		srs.add("13003000", "human science",
				"Stories related to sociology, psychology, anthropology and political science");
		srs.add("13003001", "social sciences",
				"The study of people living in groups, as families, tribes and communities");
		srs.add("13003002", "history", "The study of human events of the past");
		srs.add("13003003", "psychology", "The study of the human mind and mental and emotional processes");
		srs.add("13003004", "sociology", "The study of human social relations, organization and change");
		srs.add("13003005", "anthropology", "The study of human beings in groups or societies");
		srs.add("13004000",
				"natural science",
				"Stories related to astronomy, astrophysics, physics, chemistry, earth sciences, palaeontology, biological sciences, botany and zoology, as well as mathematics");
		srs.add("13004001", "geology", "The study of Earth’s physical processes");
		srs.add("13004002", "paleontology", "The study of ancient animals");
		srs.add("13004003", "geography", "The study of the surface of Earth and its political divisions");
		srs.add("13004004", "botany", "The study of plants");
		srs.add("13004005", "zoology", "The study of animals");
		srs.add("13004006", "physiology", "The study of vital processes of living organisms");
		srs.add("13005000", "philosophical science", "Stories related to philosophy, logic and ethics, among others");
		srs.add("13006000", "research",
				"Methodical investigation of events, procedures etc to explain why they occur, or to find solutions for problems");
		srs.add("13007000", "scientific exploration",
				"Methodical land, sea and space journeys to discover new information about them");
		srs.add("13008000", "space programme",
				"The government’s organized effort for the exploration of outer space and the bodies therein");
		srs.add("13009000",
				"science (general)",
				"Establishing and systematizing information about nature and the physical world through observation, experimentation and hypothesis");
		srs.add("13010000", "technology (general)",
				"The study of the practical or industrial arts, and applied sciences such as physics, hydrodynamics and thermodynamics");
		srs.add("13011000",
				"standards",
				"The rules, national and international, that govern science and technology. These might include international standards setting for equipment and interference standards.");
		srs.add("13012000", "animal science", "Science involving animals");
		srs.add("13013000", "micro science",
				"The multi-disciplinary areas of nanotechnology and Micro-Electrical Mechanical Systems.");
		srs.add("13014000",
				"marine science",
				"The multi-disciplinary research areas involving the worlds' waterways and oceans. This could include hyper-spectral sensing of ice flows, fisheries studies and underwater research.");
		srs.add("13015000", "weather science", "All scientific aspects of the weather and climate.");
		srs.add("13016000",
				"electronics",
				"The branch of engineering or physics concerned with the controlled flow of electrons or other carriers of electric charges, especially in semiconductor devices, including the design, manufacture, and maintenance of electronic devices");
		srs.add("13017000",
				"identification technology",
				"Includes biometrics, new computer-based identification cards, retinal scans, face scanning and mobile augmented reality systems (MARS) and other ways technology can identify individuals. Also technology vs. the privacy of personal information.");
		srs.add("13018000", "mathematics", "The study of quantities and shapes and their symbolic relationships.");
		srs.add("13019000", "biotechnology",
				"Manipulating natural organisms for scientific, medical or agricultural purposes");
		srs.add("13020000", "agricultural research and technology",
				"Pertaining to the growing of crops and management of farm animals");
		srs.add("13021000", "nanotechnology", "Manipulating objects at the molecular scale");
		srs.add("13022000", "IT/computer sciences", "The study and design of computer systems and networks.");
		srs.add("13023000", "scientific institutions",
				"Institutions that carry out or govern scientific work (e.g. National Academy of Arts and Sciences )");
		srs.add("14000000", "social issue", "Aspects of the behaviour of humans affecting the quality of life.");
		srs.add("14001000", "addiction",
				"The habitual and often uncontrollable use of harmful substances such as alcohol, tobacco and pharmaceuticals or drugs");
		srs.add("14002000", "charity", "Philanthropic giving");
		srs.add("14003000", "demographics", "The study of people and here they live and how they interact");
		srs.add("14003001", "population and census",
				"Population is the number of people in a geographical region and census is the process of counting them");
		srs.add("14003002", "immigration", "Movement of individuals from one country to the other");
		srs.add("14003003", "illegal immigrants",
				"Movement of individuals from one country to the other by illicit means");
		srs.add("14003004",
				"emigrants",
				"People who leave their country of origin, their relationship with their country of origin and their association with fellow emigrants");
		srs.add("14004000", "disabled", "Being incapacitated  either physically, emotionally or mentally");
		srs.add("14005000", "euthanasia (also includes assisted suicide)", "Voluntary death with the aid of another");
		srs.add("14005001", "suicide", "Death by one's own hand");
		srs.add("14006000", "family", "A group of individuals related by blood or marriage");
		srs.add("14006001", "parent and child", "Two or more individuals with a hierarchical familial relationship");
		srs.add("14006002", "adoption",
				"A legal process of bringing a child with no supporting parents into a supportive union");
		srs.add("14006003", "marriage",
				"The union of two individuals who pledge fidelity, respect and support for each other");
		srs.add("14006004", "divorce", "The process by which a marriage is dissolved");
		srs.add("14006005", "sex",
				"The classification of individuals as either male or female. Or conjugal relationship between two individuals.");
		srs.add("14007000", "family planning", "Conscious decisions and efforts involving reproduction");
		srs.add("14008000", "health insurance", "Insurance covering extraordinary medical costs");
		srs.add("14009000", "homelessness", "Lacking a fixed place of residence");
		srs.add("14010000",
				"minority group",
				"A group of people classified by race, language, religion or other characteristic numerically smaller than others of the same classification");
		srs.add("14010001", "gays and lesbians",
				"Those that consider themselves attracted to their same gender in an erotic or sensual or similar way.");
		srs.add("14010002",
				"national or ethnic minority",
				"Groups of people that form a minority on ethnic or national basis, their status, problems and relations to the majority");
		srs.add("14011000", "pornography",
				"Audio or visual depictions of various sex related acts considered outside accepted community standards");
		srs.add("14012000", "poverty",
				"Having insufficient resources to provide for basic services to oneself or family");
		srs.add("14013000", "prostitution", "Sex for sale, either male or female, and those who profit from it");
		srs.add("14014000", "racism", "Harmful attitudes toward another group based on racial differences");
		srs.add("14015000", "welfare",
				"Generally government help for those in need of food, housing health and other services");
		srs.add("14016000", "abortion", "Usually the planned disruption of the process of reproduction of human life");
		srs.add("14017000", "missing person", "A person who is not where they are expected to be for a period of time");
		srs.add("14017001", "missing due to hostilities",
				"People, both civilian and military, missing during or after hostilities");
		srs.add("14018000", "long term care", "Extensive health care because of serious illness or disability");
		srs.add("14019000", "juvenile delinquency", "Incidents involving perpetrators who are minors.");
		srs.add("14020000", "nuclear radiation victims",
				"Includes antinuclear movements and compensation for atomic blast victims.");
		srs.add("14021000",
				"slavery",
				"The involuntary servitude, outside of legal incarceration for statuary criminal offences,  of men, women and children, including involuntary unpaid labour, coerced actions, child labour");
		srs.add("14022000",
				"abusive behaviour",
				"The maltreatment of one or more individuals by others through dehumanizing treatment including sexual or mental abuse, deprivation of sensory abilities, deprivation of physical needs, physical mistreatment including beatings, and other forms of torture");
		srs.add("14023000",
				"death and dying",
				"Dying is the route to death. Death is the state you are in when there are no signs that you can function as a human being either physically or mentally");
		srs.add("14024000", "people",
				"Individuals as a whole, sometimes broken down into various classes, such as indigenous people, people of class etc");
		srs.add("14024001", "children", "Immature people, usually up to the age of puberty");
		srs.add("14024002", "infants",
				"Those people from birth until ages of one or two, usually when they begin walking");
		srs.add("14024003", "teen-agers", "People aged 13 to 19 years of age");
		srs.add("14024004", "adults", "People aged 20 and above");
		srs.add("14024005", "senior citizens", "People aged 60 or 65 and older");
		srs.add("14025000", "social issues (general)",
				"Issues affecting a number of individuals in their daily lives like housing, food, education, personal relationships");
		srs.add("14025001", "social conditions",
				"Conditions under which people live in terms of housing, water supply, availability of education");
		srs.add("14025002", "social problems",
				"Issues affecting the lives of individuals such as housing, education nutrition, communication etc");
		srs.add("14025003", "discrimination",
				"Denial of services to one or more people because of race, colour, sexual identity, religion, political beliefs etc");
		srs.add("14025004", "social services",
				"Government supported programs to improve the well-being of individuals or groups of individuals");
		srs.add("14026000", "ordnance clearance",
				"The removal or neutralization of ordnance such as landmines or cluster bombs, remaining after a war or armed conflict");
		srs.add("14027000",
				"reconstruction",
				"The reconstruction of economy, infrastructure and property, as well as life in general, after a war or natural disaster");
		srs.add("15000000", "sport",
				"Competitive exercise involving physical effort. Organizations and bodies involved in these activities.");
		srs.add("15001000", "aero and aviation sport", "NA");
		srs.add("15001001", "parachuting", "NA");
		srs.add("15001002", "sky diving", "NA");
		srs.add("15002000", "alpine skiing", "NA");
		srs.add("15002001", "downhill", "NA");
		srs.add("15002002", "giant slalom", "NA");
		srs.add("15002003", "super G", "NA");
		srs.add("15002004", "slalom", "NA");
		srs.add("15002005", "combined", "NA");
		srs.add("15003000", "American football", "NA");
		srs.add("15003001", "(US) National Football League (NFL) (North American)", "NA");
		srs.add("15003002", "entry deleted", "NA");
		srs.add("15003003", "AFL",
				"This Canadian football league is defunct and use of this tag should be limited to archival material.");
		srs.add("15004000", "archery", "NA");
		srs.add("15004001",
				"FITA / Outdoor target archery",
				"The competition is held outdoors on an open (flat) field, at various fixed distances. The archery competition in the Olympic Games is a part of the FITA outdoor target archery program.");
		srs.add("15004002", "crossbow shooting", "Shooting with crossbow on targets from different distances");
		srs.add("15005000", "athletics, track and field", "NA");
		srs.add("15005001", "100 m", "NA");
		srs.add("15005002", "200 m", "NA");
		srs.add("15005003", "400 m", "NA");
		srs.add("15005004", "800 m", "NA");
		srs.add("15005005", "1000 m", "NA");
		srs.add("15005006", "1500 m", "NA");
		srs.add("15005007", "mile", "NA");
		srs.add("15005008", "2000 m", "NA");
		srs.add("15005009", "3000 m", "NA");
		srs.add("15005010", "5000 m", "NA");
		srs.add("15005011", "10,000 m", "NA");
		srs.add("15005012", "20 km", "NA");
		srs.add("15005013", "one hour", "NA");
		srs.add("15005014", "25000", "NA");
		srs.add("15005015", "30000", "NA");
		srs.add("15005016", "110 m hurdles", "NA");
		srs.add("15005017", "400 m hurdles", "NA");
		srs.add("15005018", "3000 m steeplechase", "NA");
		srs.add("15005019", "high jump", "NA");
		srs.add("15005020", "pole vault", "NA");
		srs.add("15005021", "long jump", "NA");
		srs.add("15005022", "triple jump", "NA");
		srs.add("15005023", "shot put", "NA");
		srs.add("15005024", "discus throw", "NA");
		srs.add("15005025", "hammer throw", "NA");
		srs.add("15005026", "javelin throw", "NA");
		srs.add("15005027", "decathlon", "NA");
		srs.add("15005028", "4x100 m", "NA");
		srs.add("15005029", "4x200 m", "NA");
		srs.add("15005030", "4x400 m", "NA");
		srs.add("15005031", "4x800 m", "NA");
		srs.add("15005032", "4x1500 m", "NA");
		srs.add("15005033", "walk 1 h", "NA");
		srs.add("15005034", "walk 2 h", "NA");
		srs.add("15005035", "10 km walk", "NA");
		srs.add("15005036", "15 km walk", "NA");
		srs.add("15005037", "20 km walk", "NA");
		srs.add("15005038", "30 km walk", "NA");
		srs.add("15005039", "50 km walk", "NA");
		srs.add("15005040", "100 m hurdles", "NA");
		srs.add("15005041", "5 km walk", "NA");
		srs.add("15005042", "heptathlon", "NA");
		srs.add("15005043", "1500 m walk", "NA");
		srs.add("15005044", "2000 m walk", "NA");
		srs.add("15005045", "3000 m walk", "NA");
		srs.add("15005046", "50 m", "NA");
		srs.add("15005047", "50 m hurdles", "NA");
		srs.add("15005048", "50 yards", "NA");
		srs.add("15005049", "50 yard hurdles", "NA");
		srs.add("15005050", "60 m", "NA");
		srs.add("15005051", "60 m hurdles", "NA");
		srs.add("15005052", "60 yards", "NA");
		srs.add("15005053", "60 yard hurdles", "NA");
		srs.add("15005054", "100 yards", "NA");
		srs.add("15005055", "100 yard hurdles", "NA");
		srs.add("15005056", "300 m", "NA");
		srs.add("15005057", "300 yards", "NA");
		srs.add("15005058", "440 yards", "NA");
		srs.add("15005059", "500 m", "NA");
		srs.add("15005060", "500 yards", "NA");
		srs.add("15005061", "600 m", "NA");
		srs.add("15005062", "600 yards", "NA");
		srs.add("15005063", "880 yards", "NA");
		srs.add("15005064", "1000 yards", "NA");
		srs.add("15005065", "2 miles", "NA");
		srs.add("15005066", "3 miles", "NA");
		srs.add("15005067", "6 miles", "NA");
		srs.add("15005068", "4x1 mile", "NA");
		srs.add("15006000", "badminton", "NA");
		srs.add("15007000", "baseball", "NA");
		srs.add("15007001", "Major League Baseball (North American Professional) - American League", "NA");
		srs.add("15007002", "Major League Baseball (North American Professional) - National League", "NA");
		srs.add("15007003",
				"Major League Baseball (North American Professional) - Special (e.g. All-Star, World Series)", "NA");
		srs.add("15007004",
				"rubberball baseball",
				"Sometimes called ''soft baseball,'' the game is played with a rubber baseball of varying degrees of hardness depending upon the age and level of the players.");
		srs.add("15007005", "Major League Baseball Playoffs",
				"Consists of several rounds of play to determine representatives to the U.S.-based World Series");
		srs.add("15007006",
				"World Series",
				"U.S.-based annual series of games between the top two teams of Major League Baseball to determine the overall champion");
		srs.add("15008000", "basketball", "NA");
		srs.add("15008001", "National Basketball Association (North American Professional)", "NA");
		srs.add("15008002", "professional - Women general", "NA");
		srs.add("15008003", "Swiss netball", "Similar to Basketball. Basket without a board. Mainly executed by women");
		srs.add("15008004", "German netball", "Same as Swiss Netball, but with specific German rules");
		srs.add("15008005", "Dutch netball", "Same as Swiss Netball, but with specific Dutch rule");
		srs.add("15009000", "biathlon",
				"A combination of cross country skiing and target shooting on a 12.5 K course in a pursuit format.");
		srs.add("15009001", "7.5 km", "NA");
		srs.add("15009002", "10 km", "NA");
		srs.add("15009003", "15 km", "NA");
		srs.add("15009004", "20 km", "NA");
		srs.add("15009005", "4x7.5 km relay", "NA");
		srs.add("15009006", "12.5 km pursuit", "NA");
		srs.add("15010000", "billiards, snooker and pool", "NA");
		srs.add("15010001", "8 ball", "NA");
		srs.add("15010002", "9 ball", "NA");
		srs.add("15010003", "14.1", "NA");
		srs.add("15010004", "continuous", "NA");
		srs.add("15010005", "other", "NA");
		srs.add("15011000",
				"bobsleigh",
				"In bobsleigh two or four persons race down a course sitting in a sled that consists of a main hull, a frame, two axles and sets of runners. The total time of all races in a competition is added together.");
		srs.add("15011001", "two-man sled", "NA");
		srs.add("15011002", "four-man sled", "NA");
		srs.add("15012000", "bowling", "NA");
		srs.add("15013000", "bowls and petanque", "NA");
		srs.add("15014000", "boxing", "NA");
		srs.add("15014001", "super-heavyweight", "NA");
		srs.add("15014002", "heavyweight", "NA");
		srs.add("15014003", "cruiserweight", "NA");
		srs.add("15014004", "light-heavyweight", "NA");
		srs.add("15014005", "super-middleweight", "NA");
		srs.add("15014006", "middleweight", "NA");
		srs.add("15014007", "light-middleweight", "NA");
		srs.add("15014008", "welterweight", "NA");
		srs.add("15014009", "light-welterweight", "NA");
		srs.add("15014010", "lightweight", "NA");
		srs.add("15014011", "super-featherweight", "NA");
		srs.add("15014012", "featherweight", "NA");
		srs.add("15014013", "super-bantamweight", "NA");
		srs.add("15014014", "bantamweight", "NA");
		srs.add("15014015", "super-flyweight", "NA");
		srs.add("15014016", "flyweight", "NA");
		srs.add("15014017", "light flyweight", "NA");
		srs.add("15014018", "straw", "NA");
		srs.add("15014019", "IBF", "NA");
		srs.add("15014020", "WBA", "NA");
		srs.add("15014021", "WBC", "NA");
		srs.add("15014022", "WBO", "NA");
		srs.add("15014023", "French boxing", "NA");
		srs.add("15014024", "Thai boxing", "NA");
		srs.add("15015000", "canoeing and kayaking", "NA");
		srs.add("15015001", "Slalom", "NA");
		srs.add("15015002", "200 m", "NA");
		srs.add("15015003", "500 m", "NA");
		srs.add("15015004", "1000 m", "NA");
		srs.add("15015005", "K1", "NA");
		srs.add("15015006", "K2", "NA");
		srs.add("15015007", "K4", "NA");
		srs.add("15015008", "C1", "NA");
		srs.add("15015009", "C2", "NA");
		srs.add("15015010", "C4", "NA");
		srs.add("15015011", "canoe sailing", "NA");
		srs.add("15015012", "pontoniering", "Team sport, military tradition, similar to canoe regatta, in boats");
		srs.add("15016000", "climbing", "NA");
		srs.add("15016001", "mountaineering", "Alpine climbing");
		srs.add("15016002", "sport climbing",
				"Sport climbing as a special category: individual competition, on an artificial wall with time measurement");
		srs.add("15017000", "cricket", "NA");
		srs.add("15018000", "curling", "NA");
		srs.add("15018001",
				"icestock sport",
				"Similar to curling, played on targets on ice, different stone with straight handle and different rules, played in alpine countries");
		srs.add("15019000", "cycling", "NA");
		srs.add("15019001", "track", "NA");
		srs.add("15019002", "pursuit", "NA");
		srs.add("15019003", "Olympic sprint", "NA");
		srs.add("15019004", "sprint", "NA");
		srs.add("15019005", "Keirin", "NA");
		srs.add("15019006", "points race", "NA");
		srs.add("15019007", "Madison race", "NA");
		srs.add("15019008", "500 m time trial", "NA");
		srs.add("15019009", "1 km time trial", "NA");
		srs.add("15019010", "one hour", "NA");
		srs.add("15019011", "road race", "NA");
		srs.add("15019012", "road time trial", "NA");
		srs.add("15019013", "staging race", "NA");
		srs.add("15019014", "cyclo-cross", "NA");
		srs.add("15019015", "Vtt", "NA");
		srs.add("15019016", "Vtt-cross", "NA");
		srs.add("15019017", "Vtt-downhill", "NA");
		srs.add("15019018", "bi-crossing", "NA");
		srs.add("15019019", "trial", "NA");
		srs.add("15019020", "artistic cycling", "Individual or duet on one or two bicycles. Valuation by a jury");
		srs.add("15019021", "cycle ball",
				"Competitive team sport using bicycles. One team against another with two persons per team");
		srs.add("15020000", "dancing", "NA");
		srs.add("15021000", "diving", "NA");
		srs.add("15021001", "10 m platform", "NA");
		srs.add("15021002", "10 m platform synchronised", "NA");
		srs.add("15021003", "3 m springboard", "NA");
		srs.add("15021004", "3 m springboard synchronised", "NA");
		srs.add("15021005", "subaquatics", "NA");
		srs.add("15021006", "scuba diving", "Diving into different depths, with time measurement");
		srs.add("15022000", "equestrian", "NA");
		srs.add("15022001", "three-day event", "NA");
		srs.add("15022002", "dressage", "NA");
		srs.add("15022003", "jumping", "NA");
		srs.add("15022004", "cross country", "NA");
		srs.add("15023000", "fencing", "NA");
		srs.add("15023001", "epee", "NA");
		srs.add("15023002", "foil", "NA");
		srs.add("15023003", "sabre", "NA");
		srs.add("15024000", "field Hockey", "NA");
		srs.add("15024001", "roll hockey",
				"Team sport similar to ice hockey, executed on 4 wheel roller skates with sticks and a ball");
		srs.add("15025000", "figure Skating", "NA");
		srs.add("15025001", "singles", "NA");
		srs.add("15025002", "pairs", "NA");
		srs.add("15025003", "ice dance", "NA");
		srs.add("15026000", "freestyle Skiing", "NA");
		srs.add("15026001", "moguls", "NA");
		srs.add("15026002", "aerials", "NA");
		srs.add("15026003", "artistic skiing", "NA");
		srs.add("15027000", "golf", "NA");
		srs.add("15028000", "gymnastics", "NA");
		srs.add("15028001", "floor exercise", "NA");
		srs.add("15028002", "vault", "NA");
		srs.add("15028003", "pommel horse", "NA");
		srs.add("15028004", "uneven bars", "NA");
		srs.add("15028005", "parallel bars", "NA");
		srs.add("15028006", "horizontal bar", "NA");
		srs.add("15028007", "rings", "NA");
		srs.add("15028008", "beam", "NA");
		srs.add("15028009", "rythmic", "NA");
		srs.add("15028010", "clubs", "NA");
		srs.add("15028011", "hoop", "NA");
		srs.add("15028012", "ribbon", "NA");
		srs.add("15028013", "rope", "NA");
		srs.add("15028014", "ball", "NA");
		srs.add("15028015", "trampoline", "NA");
		srs.add("15029000", "handball (team)", "NA");
		srs.add("15030000", "horse racing, harness racing", "NA");
		srs.add("15030001", "flat racing", "NA");
		srs.add("15030002", "steeple chase", "NA");
		srs.add("15030003", "trotting", "NA");
		srs.add("15030004", "cross country", "NA");
		srs.add("15031000", "ice hockey", "NA");
		srs.add("15031001", "National Hockey League (North American)", "NA");
		srs.add("15031002", "sledge hockey", "NA");
		srs.add("15032000",
				"Jai Alai (Pelota)",
				"Because of the game organization, the proper identification of a specific game may require the combination of 2 subject details");
		srs.add("15032001",
				"fronton",
				"The 'fronton' known as 'Fronton Place Libre' consists of a rectangular out-door court plus a large pink shaped wall at one end. The two sides and the other end are left opened.");
		srs.add("15032003",
				"left wall",
				"A 'fronton with left hand wall' is an in-door fronton with a 36 meters long court where Pala or Main Nue are played. Three walls are used in the game: the front, the back and the left hand wall.");
		srs.add("15032004",
				"trinquet",
				"A 'Trinquet' is an in-door fronton with a 28.5 meters long court surrounded by four walls. The four walls are used in the game.");
		srs.add("15033000", "judo", "NA");
		srs.add("15033001", "heavyweight", "NA");
		srs.add("15033002", "half-heavyweight", "NA");
		srs.add("15033003", "middleweight", "NA");
		srs.add("15033004", "half-middleweight", "NA");
		srs.add("15033005", "half-lightweight", "NA");
		srs.add("15033006", "lightweight", "NA");
		srs.add("15033007", "extra lightweight", "NA");
		srs.add("15034000", "karate", "NA");
		srs.add("15034001", "sparring", "NA");
		srs.add("15034002", "formal exercise", "NA");
		srs.add("15035000", "lacrosse", "NA");
		srs.add("15036000",
				"luge",
				"Luge (French word for sled) is competed in singles or doubles. The competitor(s) lay on their back on an open sled and race down a course. The competitor(s) and the sled must be in contact when passing the finishing line. The competitor can steer the sled");
		srs.add("15036001", "singles", "NA");
		srs.add("15036002", "doubles", "NA");
		srs.add("15037000", "marathon", "NA");
		srs.add("15038000", "modern pentathlon", "NA");
		srs.add("15038001", "running", "NA");
		srs.add("15038002", "shooting", "NA");
		srs.add("15038003", "swimming", "NA");
		srs.add("15038004", "fencing", "NA");
		srs.add("15038005", "showjumping", "NA");
		srs.add("15039000", "motor racing", "NA");
		srs.add("15039001", "Formula One", "NA");
		srs.add("15039002", "F3000", "NA");
		srs.add("15039003", "endurance", "NA");
		srs.add("15039004", "Indy", "NA");
		srs.add("15039005", "CART", "NA");
		srs.add("15039006", "NHRA", "NA");
		srs.add("15039007", "NASCAR", "NA");
		srs.add("15039008", "TRUCKI", "NA");
		srs.add("15040000", "motor rallying", "NA");
		srs.add("15040001", "rallying", "NA");
		srs.add("15040002", "raid", "NA");
		srs.add("15040003", "rallycross", "NA");
		srs.add("15041000", "motorcycling", "NA");
		srs.add("15041001", "speed-Grand-Prix", "NA");
		srs.add("15041002", "enduro", "NA");
		srs.add("15041003", "grass-track", "NA");
		srs.add("15041004", "moto-ball", "NA");
		srs.add("15041005", "moto-cross", "NA");
		srs.add("15041006", "rallying", "NA");
		srs.add("15041007", "trial", "NA");
		srs.add("15041008", "endurance", "NA");
		srs.add("15041009", "superbike", "NA");
		srs.add("15041010", "125 cm3", "NA");
		srs.add("15041011", "250 cm3", "NA");
		srs.add("15041012", "500 cm3", "NA");
		srs.add("15041013", "side-cars", "NA");
		srs.add("15042000", "netball", "NA");
		srs.add("15043000", "nordic skiing", "NA");
		srs.add("15043001", "cross-country", "NA");
		srs.add("15043002", "5 km classical time", "NA");
		srs.add("15043003", "10 km classical style", "NA");
		srs.add("15043004", "10 km pursuit free style", "NA");
		srs.add("15043005", "15 km classical style", "NA");
		srs.add("15043006", "15 km pursuit free style", "NA");
		srs.add("15043007", "10 km + 15 km combined", "NA");
		srs.add("15043008", "30 km classical style", "NA");
		srs.add("15043009", "30km free style", "NA");
		srs.add("15043010", "50 km free style", "NA");
		srs.add("15043011", "4x5 km relay", "NA");
		srs.add("15043012", "4x10 km relay", "NA");
		srs.add("15043013", "nordic combined", "NA");
		srs.add("15043014", "raid", "NA");
		srs.add("15043015", "5 km pursuit free style", "Cross country skiing over a 5 K course in a pursuit format");
		srs.add("15043016", "1.5 km sprint free", "Cross country skiing over a 1.5 K course in a sprint format");
		srs.add("15043017", "50 km classic style", "Cross country skiing over a 50 K course in a classic format");
		srs.add("15044000", "orienteering", "NA");
		srs.add("15044001", "Ski orienteering", "NA");
		srs.add("15045000", "polo", "NA");
		srs.add("15046000", "power boating", "NA");
		srs.add("15046001", "F1", "NA");
		srs.add("15046002", "F2", "NA");
		srs.add("15047000", "rowing", "NA");
		srs.add("15047001", "single sculls", "NA");
		srs.add("15047002", "double sculls", "NA");
		srs.add("15047003", "quadruple sculls", "NA");
		srs.add("15047004", "coxless pair", "NA");
		srs.add("15047005", "coxless four", "NA");
		srs.add("15047006", "eight", "NA");
		srs.add("15047007", "lightweight", "NA");
		srs.add("15048000", "rugby league", "NA");
		srs.add("15049000", "rugby union", "NA");
		srs.add("15049001", "rugby 7", "NA");
		srs.add("15050000", "sailing", "NA");
		srs.add("15050001", "Tornado", "NA");
		srs.add("15050002", "soling", "NA");
		srs.add("15050003", "49er", "NA");
		srs.add("15050004", "Europe", "NA");
		srs.add("15050005", "Laser", "NA");
		srs.add("15050006", "470", "NA");
		srs.add("15050007", "Finn", "NA");
		srs.add("15050008", "Star", "NA");
		srs.add("15050009", "flying dutchmann", "NA");
		srs.add("15050010", "505", "NA");
		srs.add("15050011", "staging race", "NA");
		srs.add("15050012", "around the world", "NA");
		srs.add("15050013", "monohull", "NA");
		srs.add("15050014", "multihulls", "NA");
		srs.add("15051000", "shooting", "NA");
		srs.add("15051001", "10 m air rifle", "NA");
		srs.add("15051002", "10 m air pistol", "NA");
		srs.add("15051003", "10 m running target", "NA");
		srs.add("15051004", "25 m rapid fire pistol", "NA");
		srs.add("15051005", "25 m sport pistol", "NA");
		srs.add("15051006", "50 m free pistol", "NA");
		srs.add("15051007", "50 m free rifle prone", "NA");
		srs.add("15051008", "50 m free rifle 3x40", "NA");
		srs.add("15051009", "50 m sport rifle 3x20", "NA");
		srs.add("15051010", "trap", "NA");
		srs.add("15051011", "double trap", "NA");
		srs.add("15051012", "skeet", "NA");
		srs.add("15052000", "ski jumping", "NA");
		srs.add("15052001", "K90 jump", "NA");
		srs.add("15052002", "K120 jump", "NA");
		srs.add("15052003", "K180 (flying jump)", "NA");
		srs.add("15053000", "snow boarding", "NA");
		srs.add("15053001", "giant slalom", "NA");
		srs.add("15053002", "half-pipe", "NA");
		srs.add("15054000", "soccer", "NA");
		srs.add("15055000", "softball", "NA");
		srs.add("15056000", "speed skating", "NA");
		srs.add("15056001", "500 m", "NA");
		srs.add("15056002", "1000 m", "NA");
		srs.add("15056003", "1500 m", "NA");
		srs.add("15056004", "3000 m", "NA");
		srs.add("15056005", "5000 m", "NA");
		srs.add("15056006", "10000 m", "NA");
		srs.add("15056007", "Short-track", "NA");
		srs.add("15056008", "st 500 m", "NA");
		srs.add("15056009", "st 1000m", "NA");
		srs.add("15056010", "st 1500m", "NA");
		srs.add("15056011", "st 3000m", "NA");
		srs.add("15056012", "st 3000m relay", "NA");
		srs.add("15056013", "st 5000m", "NA");
		srs.add("15056014", "st 5000m relay", "NA");
		srs.add("15057000", "speedway", "NA");
		srs.add("15058000", "sports organisations", "NA");
		srs.add("15058001", "IOC", "NA");
		srs.add("15058002", "international federation", "NA");
		srs.add("15058003", "continental federation", "NA");
		srs.add("15058004", "national federation", "NA");
		srs.add("15058005", "GAISF", "NA");
		srs.add("15059000", "squash", "NA");
		srs.add("15060000", "sumo wrestling", "NA");
		srs.add("15061000", "surfing", "NA");
		srs.add("15062000", "swimming", "NA");
		srs.add("15062001", "50 m freestyle", "NA");
		srs.add("15062002", "100 m freestyle", "NA");
		srs.add("15062003", "200 m freestyle", "NA");
		srs.add("15062004", "400 m freestyle", "NA");
		srs.add("15062005", "800 m freestyle", "NA");
		srs.add("15062006", "1500 m freestyle", "NA");
		srs.add("15062007", "relay 4x50 m freestyle", "NA");
		srs.add("15062008", "relay 4x100 m freestyle", "NA");
		srs.add("15062009", "relay 4x200 m freestyle", "NA");
		srs.add("15062010", "50 m backstroke", "NA");
		srs.add("15062011", "100 m backstroke", "NA");
		srs.add("15062012", "200 m backstroke", "NA");
		srs.add("15062013", "50 m breaststroke", "NA");
		srs.add("15062015", "100 m breaststroke", "NA");
		srs.add("15062015", "200 m breaststroke", "NA");
		srs.add("15062016", "50 m butterfly", "NA");
		srs.add("15062017", "100 m butterfly", "NA");
		srs.add("15062018", "200 m butterfly", "NA");
		srs.add("15062019", "100 m medley", "NA");
		srs.add("15062020", "200 m medley", "NA");
		srs.add("15062021", "400 m medley", "NA");
		srs.add("15062022", "relay 4x50 m medlay", "NA");
		srs.add("15062023", "relay4x100 m medley", "NA");
		srs.add("15062024", "short course", "NA");
		srs.add("15062025", "synchronised technical routine", "NA");
		srs.add("15062026", "synchronised free routine", "NA");
		srs.add("15063000", "table tennis", "NA");
		srs.add("15064000", "Taekwon-Do", "NA");
		srs.add("15064001", "under 49 kg", "NA");
		srs.add("15064002", "under 58 kg", "NA");
		srs.add("15064003", "49-57 kg", "NA");
		srs.add("15064004", "58-68 kg", "NA");
		srs.add("15064005", "57-67 kg", "NA");
		srs.add("15064006", "68-80 kg", "NA");
		srs.add("15064007", "over 67 kg", "NA");
		srs.add("15064008", "over 80 kg", "NA");
		srs.add("15065000", "tennis", "NA");
		srs.add("15066000", "triathlon", "NA");
		srs.add("15066001", "triathlon swimming", "NA");
		srs.add("15066002", "triathlon cycling", "NA");
		srs.add("15066003", "triathlon run", "NA");
		srs.add("15067000", "volleyball", "NA");
		srs.add("15067001", "beach volleyball", "NA");
		srs.add("15068000", "water polo", "NA");
		srs.add("15069000", "water skiing", "NA");
		srs.add("15069001", "slalom", "NA");
		srs.add("15069002", "trick", "NA");
		srs.add("15069003", "jump", "NA");
		srs.add("15069004", "combined", "NA");
		srs.add("15070000", "weightlifting", "NA");
		srs.add("15070001", "snatch", "NA");
		srs.add("15070002", "clean and jerk", "NA");
		srs.add("15070003", "48 kg", "NA");
		srs.add("15070004", "53 kg", "NA");
		srs.add("15070005", "63 kg", "NA");
		srs.add("15070006", "75 kg", "NA");
		srs.add("15070007", "over 75 kg", "NA");
		srs.add("15070008", "56 kg", "NA");
		srs.add("15070009", "62 kg", "NA");
		srs.add("15070010", "69 kg", "NA");
		srs.add("15070011", "77 kg", "NA");
		srs.add("15070012", "85 kg", "NA");
		srs.add("15070013", "94 kg", "NA");
		srs.add("15070014", "105 kg", "NA");
		srs.add("15070015", "over 105 kg", "NA");
		srs.add("15070016", "powerlifting", "NA");
		srs.add("15071000", "windsurfing", "NA");
		srs.add("15071001", "ocean", "NA");
		srs.add("15071002", "lake", "NA");
		srs.add("15071003", "river", "NA");
		srs.add("15071004", "land", "NA");
		srs.add("15072000", "wrestling", "NA");
		srs.add("15072001", "freestyle", "NA");
		srs.add("15072002", "greco-roman", "NA");
		srs.add("15072003", "over 130 kg", "NA");
		srs.add("15072004", "130 kg", "NA");
		srs.add("15072005", "97 kg", "NA");
		srs.add("15072006", "85 kg", "NA");
		srs.add("15072007", "76 kg", "NA");
		srs.add("15072008", "69 kg", "NA");
		srs.add("15072009", "63 kg", "NA");
		srs.add("15072010", "58 kg", "NA");
		srs.add("15072011", "54 kg", "NA");
		srs.add("15072012", "Swiss wrestling", "Traditional Swiss sport similar to wrestling with specific rules");
		srs.add("15073000", "sports event", "NA");
		srs.add("15073001", "Summer Olympics", "NA");
		srs.add("15073002", "Winter Olympics", "NA");
		srs.add("15073003", "Summer universiade", "NA");
		srs.add("15073004", "Winter Universiade", "NA");
		srs.add("15073005", "Commonwealth Games", "NA");
		srs.add("15073006", "Winter Goodwill Games", "NA");
		srs.add("15073007", "Summer Asian Games", "NA");
		srs.add("15073008", "Winter Asian Games", "NA");
		srs.add("15073009", "Panamerican Games", "NA");
		srs.add("15073010", "African Games", "NA");
		srs.add("15073011", "Mediterranean Games", "NA");
		srs.add("15073012", "SouthEast Asiatic Games", "NA");
		srs.add("15073013", "PanPacific Games", "NA");
		srs.add("15073014", "SouthPacific Games", "NA");
		srs.add("15073015", "PanArabic Games", "NA");
		srs.add("15073016", "Summer Goodwill Games", "NA");
		srs.add("15073017", "World games", "NA");
		srs.add("15073018", "World Cup", "NA");
		srs.add("15073019", "intercontinental cup", "NA");
		srs.add("15073020", "continental cup", "NA");
		srs.add("15073021", "international cup", "NA");
		srs.add("15073022", "National Cup", "NA");
		srs.add("15073023", "interregional cup", "NA");
		srs.add("15073024", "regional cup", "NA");
		srs.add("15073025", "league cup", "NA");
		srs.add("15073026", "world championship", "NA");
		srs.add("15073027", "intercontinental championship", "NA");
		srs.add("15073028", "continental championship 1st level", "NA");
		srs.add("15073029", "continental championship 2nd level", "NA");
		srs.add("15073030", "continental championship 3rd level", "NA");
		srs.add("15073031", "national championship 1st level", "NA");
		srs.add("15073032", "national championship 2nd level", "NA");
		srs.add("15073033", "national championship3rdlevel", "NA");
		srs.add("15073034", "national championship 4th level", "NA");
		srs.add("15073035", "regional championship", "NA");
		srs.add("15073036", "Grand Prix", "NA");
		srs.add("15073037", "intercontinental tournament", "NA");
		srs.add("15073038", "continental tournament", "NA");
		srs.add("15073039", "international tournament", "NA");
		srs.add("15073040", "national tournament", "NA");
		srs.add("15073041", "inter-nations competition", "NA");
		srs.add("15073042", "inter-clubs competition", "NA");
		srs.add("15073043", "friendly competition", "NA");
		srs.add("15073044", "all-stars competition", "NA");
		srs.add("15073045", "exhibition", "NA");
		srs.add("15073046", "Super Bowl", "A contest to decide who is the best in American professional football");
		srs.add("15074000", "rodeo", "NA");
		srs.add("15074001", "barrel racing", "NA");
		srs.add("15074002", "calf roping", "NA");
		srs.add("15074003", "bull riding", "NA");
		srs.add("15074004", "bulldogging", "NA");
		srs.add("15074005", "saddle bronc", "NA");
		srs.add("15074006", "bareback", "NA");
		srs.add("15074007", "goat roping", "NA");
		srs.add("15075000", "mini golf sport", "NA");
		srs.add("15076000",
				"bandy",
				"Played outdoors on ice. The size of the ice rink is about the size of a soccer field. Skates like ice hockey. A small hard ball is used for playing. Players play with sticks, much like in ice hockey, but the sticks are shorter and more rounded than in ic");
		srs.add("15077000",
				"flying disc",
				"A group of events all played with a flying plastic disc. The exact regulation for the disc is different in  different events but it has to be unbroken of solid plastic and a production model with no modification. Flying disc is sometimes called Frisbee bu");
		srs.add("15077001",
				"ultimate",
				"Team game. Played outdoors on soccer-size field with 7 players per team and indoors with 5 players per team. Games are played to a preset number of goals. Goals are scored by passing the disc to a team-member catching it inside the goal area. Player with");
		srs.add("15077002",
				"guts",
				"Team game where two teams of 5 players each face each other. Teams take turns to throw the disc towards the other team. Points are scored if the opposing team does not catch the disc.");
		srs.add("15077003",
				"overall",
				"Not an event in itself but in most competitions with individual events the winner of the competition will be awarded to the player with the highest combined score in the events.");
		srs.add("15077004",
				"distance",
				"The object is to throw the disc as far as possible. Each player get five throws per turn. Throws are made downwind. World record is over 200 meters.");
		srs.add("15077005",
				"discathon",
				"The object is to throw and run a park course of about 1 kilometre. Four players compete in each heat. They have two discs each. They may also carry a third disc in reserve. Where on thrown disc stops the second disc must be thrown. The player then picks u");
		srs.add("15077006",
				"DDC",
				"Abbreviation for Double Disc Court. Two players per team in a square 13x13 meter. The teams start with one disc per team and throw at each other. Discs are thrown back and forth until one or both hit the ground. Points are scored for making the disc stop");
		srs.add("15077007",
				"SCF",
				"Abbreviation for Self Caught Flights. Divided into two subevents called MTA (Maximum Time Aloft) and TRC (Throw Run Catch). In both subevents the player throw a disc and then run to catch it clean with one hand before it hits the ground. In MTA the time b");
		srs.add("15077008",
				"freestyle",
				"A judged event where groups of two or three players perform as many tricks as possible. In competitions the judges can use either a ranking system or set scores on presentation, execution and difficulty.");
		srs.add("15077009",
				"accuracy",
				"Each player has 28 throws from various distances and angles to throw the disc through a goal 1.5 x 1.5 meters. World record is 25 of 28 possible.");
		srs.add("15077010",
				"disc golf",
				"Much like ball golf but instead of balls and clubs, discs are used. And instead of a hole in the ground there is a metal basket with light metal chains to throw the disc at. Players often carry several discs specialized for long throws, right or left bend");
		srs.add("15078000",
				"floorball",
				"Played indoors in a court the size of a basketball court. 6 players per team, of which one is a goalkeeper. He/she operates kneeling but there is no goal-stick like in icehockey. The players use plastic clubs and a light plastic ball to pass and shot goal");
		srs.add("15079000", "casting", "NA");
		srs.add("15080000", "tug-of-war", "NA");
		srs.add("15081000", "croquette", "NA");
		srs.add("15082000", "dog racing", "Competition between dogs running over a given distance");
		srs.add("15082001", "sled", "Harnessed to a sled");
		srs.add("15082002", "oval track", "Pursuing an artificial rabbit around an oval track");
		srs.add("15083000",
				"skeleton",
				"In skeleton the competitor lay on his/hers stomach when racing down the course. The competitor must be on the sled when crossing the finishing line. The total time of all races in a competition is added together. Skeleton is considered the first sliding s");
		srs.add("15084000", "Australian rules football", "NA");
		srs.add("15085000", "Canadian football", "NA");
		srs.add("15086000", "duathlon", "Duathlon");
		srs.add("15087000",
				"hornuss",
				"Swiss team sport with 16 or 18 men per team. A rubber puck is hit towards the field of the adversary team which tries to hit the puck in the air with a wooden board thrown in the air");
		srs.add("15088000", "fist ball",
				"Men's team sport similar to volleyball (with a much lower net) executed mainly in gymnastics clubs");
		srs.add("15089000", "inline skating", "Competitive sports using inline skates");
		srs.add("15090000", "grass ski", "Alpine skiing on roller skis and grass");
		srs.add("15091000", "snowbiking",
				"Individual sport on snow on a snow bike, the athlete has two mini skis, previous name: ski bob");
		srs.add("15092000", "twirling", "Team competition with majorettes and a jury");
		srs.add("16000000", "unrest, conflicts and  war",
				"Acts of socially or politically motivated protest and/or violence.");
		srs.add("16001000", "act of terror",
				"Act of violence, often deadly, designed to raise fear and anxiety in a population");
		srs.add("16002000", "armed conflict",
				"Disputes between opposing groups involving the use of weaponry, but not formally declared a war");
		srs.add("16003000", "civil unrest",
				"Dissatisfaction among the general population as evidenced by rallies, strikes, demonstrations or sabotage");
		srs.add("16003001",
				"revolutions",
				"An often violent change in a nation's system of government by internal forces that results in systematic social change.");
		srs.add("16003002",
				"rebellions",
				"Armed  uprising by citizens of a nation with the intent to overthrow the government, without necessarily achieving social change");
		srs.add("16003003", "political dissent",
				"Disagreement between political groups, usually organized and sometimes resulting in imprisonment of the dissenters");
		srs.add("16003004", "religious conflicts", "Conflicts involving religious differences");
		srs.add("16003005", "social conflicts", "Conflicts involving social differences");
		srs.add("16004000", "coup d'etat",
				"The overthrow of an established government by an organized group, often the military or a political party");
		srs.add("16005000", "guerrilla activity",
				"Anti-government actions by clandestine groups using hit-and-run techniques or sabotage, kidnapping and the like");
		srs.add("16005001", "bioterrorism",
				"Use of biological agent to raise the level of fear within a population, whether deaths occur or not.");
		srs.add("16005002", "bombings", "Use of explosive devices against people, buildings or structures");
		srs.add("16006000", "massacre", "The death of a large group of people over a brief period of time");
		srs.add("16006001", "genocide", "Systematic killing of one clan, tribe or ethnic type by another");
		srs.add("16007000", "riots",
				"Violent, destructive demonstrations often involving injury to individuals and destruction of property");
		srs.add("16008000", "demonstration", "A public show of feeling or opinion, as by a mass meeting or parade");
		srs.add("16009000", "war", "A formal declaration of hostilities by one country against another");
		srs.add("16009001",
				"civil war",
				"Armed conflict between members of the same nation or geographical region, in some cases with a desire to divide the nation or region.");
		srs.add("16009002",
				"international military interventions",
				"Temporary use of international forces by invitation or by a decision of an outside body in another country or region for the purpose of resolving a crisis.");
		srs.add("16009003", "prisoners and detainees",
				"People captured and imprisoned by their enemy during war or armed conflict");
		srs.add("16010000", "conflict (general)", "A dispute which can be at several levels,");
		srs.add("16011000",
				"crisis",
				"Conflict of all kinds that rises to a level where, depending on events, governments can fall, war be declared or stock markets crash, or not");
		srs.add("16012000", "weaponry", "Armaments of all types used to conduct war");
		srs.add("17000000", "weather", "The study, reporting and prediction of meteorological phenomena.");
		srs.add("17001000", "forecast",
				"Prediction of the course of the weather in the future either near term or long term");
		srs.add("17002000", "global change",
				"The determination whether the Earth is getting warm, or colder, whether seas are rising or falling and the like");
		srs.add("17003000", "report", "Any distributed announcement about the weather");
		srs.add("17004000",
				"statistic",
				"Numerical facts about the weather such as temperature, barometric pressure, river levels, humidity, high and low tides and the like");
		srs.add("17005000", "warning", "Alerts to the general populace about severe weather coming their way");

		return srs;
	}
}