USE `test`;

/*Table structure for table `tab_route` */

DROP TABLE IF EXISTS `tab_route`;
CREATE TABLE `tab_route` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(500) NOT NULL,
  `price` double NOT NULL,
  `routeIntroduce` varchar(1000) DEFAULT NULL,
  `rflag` char(1) NOT NULL,
  `rdate` varchar(19) DEFAULT NULL,
  `isThemeTour` char(1) NOT NULL,
  `count` int(11) DEFAULT '0',
  `cid` int(11) NOT NULL,
  `rimage` varchar(200) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  `sourceId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `AK_nq_sourceId` (`sourceId`),
  KEY `FK_category_route` (`cid`),
  KEY `FK_seller_route` (`sid`),
  CONSTRAINT `FK_category_route` FOREIGN KEY (`cid`) REFERENCES `tab_category` (`cid`),
  CONSTRAINT `FK_seller_route` FOREIGN KEY (`sid`) REFERENCES `tab_seller` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=514 DEFAULT CHARSET=utf8;

/*Data for the table `tab_route` */

insert  into `tab_route`(`rid`,`rname`,`price`,`routeIntroduce`,`rflag`,`rdate`,`isThemeTour`,`count`,`cid`,`rimage`,`sid`,`sourceId`) values 
(1,'test',999,'test','1','2018-02-09 01:13:16','0',1,5,'1.jpg',1,'23677');


/*Table structure for table `tab_user` */

DROP TABLE IF EXISTS `tab_user`;

CREATE TABLE `tab_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(32) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `telephone` varchar(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `AK_nq_username` (`username`),
  UNIQUE KEY `AK_nq_code` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `tab_user` */

insert  into `tab_user`(`uid`,`username`,`password`,`name`,`birthday`,`sex`,`telephone`,`email`,`status`,`code`) values 
(1,'duolaameng','duolaameng','哆啦A梦','2018-10-05','男','15656788765','aaa@outlook.com','Y','20e35a682e3b4d8fbb7d62760dfaddcf'),
(2,'yuanjingxiang','yuanjingxiang','源静香','2018-10-01','女','15656788765','bbb@outlook.com','Y','a7a182ae748041e8b5f85fe10b8e8bb0'),
(3,'yebidaxiong','yebidaxiiong','野比大雄','2018-10-09','男','15543444334','ccc@outlook.com','Y','05acf3c4bd334deba0b8612de8d16f74');

DROP TABLE IF EXISTS `tab_favorite`;
CREATE TABLE `tab_favorite` (
  `rid` int(11) NOT NULL,
  `date` date NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`rid`,`uid`),
  KEY `FK_user_favorite` (`uid`),
  CONSTRAINT `FK_route_favorite` FOREIGN KEY (`rid`) REFERENCES `tab_route` (`rid`),
  CONSTRAINT `FK_user_favorite` FOREIGN KEY (`uid`) REFERENCES `tab_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tab_favorite` */

insert  into `tab_favorite`(`rid`,`date`,`uid`) values 
(1,'2018-10-26',1),
(1,'2018-11-14',2),
(1,'2018-11-28',3);