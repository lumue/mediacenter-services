package io.github.lumue.mc.dlservice.sites.xh


import org.junit.Assert
import org.junit.Test


class VideoModelParserTest {


    val jsonString = arrayOf("""
        {
	"visitFavorite": true,
	"videoModel": {
		"duration": 275,
		"title": "Nina Elle's big fat bombs in your face! - Naughty America",
		"pageURL": "https:\/\/de.xhamster.com\/videos\/nina-elle-s-big-fat-bombs-in-your-face-naughty-america-8653702",
		"icon": null,
		"spriteURL": "https:\/\/thumb-v2.xhcdn.com\/a\/exEARJHel80J4yCristdog\/008\/653\/702\/160x160.50.s.jpg",
		"trailerURL": "https:\/\/thumb-v2.xhcdn.com\/a\/XrQ_BNEY-T64qIWTqaJpQw\/008\/653\/702\/240x135.t.mp4",
		"rating": {
			"modelName": "ratingModel",
			"value": 98,
			"entityModel": "videoModel",
			"entityID": 8653702,
			"likes": 56,
			"dislikes": 1,
			"state": 0
		},
		"isVR": false,
		"isHD": true,
		"isUHD": false,
		"created": 1512564002,
		"modelName": "videoModel",
		"thumbURL": "https:\/\/thumb-v-cl2.xhcdn.com\/a\/2HwiMvEEBePzYrgSRBLl9g\/008\/653\/702\/1280x720.4.jpg",
		"id": 8653702,
		"views": 57360,
		"comments": 2,
		"modified": 0,
		"orientation": 0,
		"secured": 0,
		"status": 2,
		"description": "Nina Elle&#039;s hot, but her sister&#039;s not! She&#039;s trying to get her man&#039;s friend Sean to go on a date with her sis, but he&#039;s not having it. UNTIL Nina sticks her big tits in his face! Game on!",
		"mp4File": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/240p.h264.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=118k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=e5ef9d46c5dbe941ec9528e35ee70a28",
		"spriteCount": 50,
		"playerThumbURL": "https:\/\/static-cl.xhcdn.com\/images\/showcase.png",
		"sources": {
			"download": {
				"240p": {
					"link": "https:\/\/de.xhamster.com\/movies\/8653702\/download\/240p",
					"size": 15.96
				},
				"480p": {"link": "https:\/\/de.xhamster.com\/movies\/8653702\/download\/480p", "size": 31.91},
				"720p": {"link": "https:\/\/de.xhamster.com\/movies\/8653702\/download\/720p", "size": 60.14}
			},
			"mp4": {
				"720p": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/720p.h264.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=448k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=96ca7aaad459d81f0b01303b54ad20c2",
				"480p": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/480p.h264.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=238k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=38fc4020bce89428f80cb339d72ce094",
				"240p": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/240p.h264.mp4?cdn_creation_time=1536847200&cdn_ttl=14400&cdn_bw=118k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=e1acd86ed3339c48bacf87937f1396e4"
			}
		},
		"dimensions": {
			"ext": "mp4",
			"v": 7,
			"cnt320p": 50,
			"valid320p": 40,
			"mediaInfo": {"keyframe": 120},
			"watermark": true,
			"trailer": {"version": 8, "160x120": 102, "240x180": 168, "320x180": 198, "320x240": 234},
			"cdn": 7,
			"video": {
				"720p": {"h264": 61583, "vp9": 43132, "h265": 31008},
				"480p": {"h264": 32678},
				"240p": {"h264": 16344}
			},
			"ml-thumb": 1,
			"ceph-cleaned": 2
		},
		"categories": [{
			"name": "Naughty America",
			"url": "\/channels\/naughty-america",
			"sponsor-tag": true,
			"pornstar": false,
			"id": "40829"
		}, {
			"name": "Nina Elle",
			"url": "\/pornstars\/nina-elle",
			"sponsor-tag": false,
			"pornstar": true
		}, {
			"name": "Abspritzen",
			"url": "\/categories\/cumshot",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "18"
		}, {
			"name": "Blondinen",
			"url": "\/categories\/blonde",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "11"
		}, {
			"name": "Cheating",
			"url": "\/categories\/cheating",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "351"
		}, {
			"name": "Gro\u00dfe Titten",
			"url": "\/categories\/big-tits",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "671"
		}, {
			"name": "Gro\u00dfer Schwanz",
			"url": "\/categories\/big-cock",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "2807"
		}, {
			"name": "Videos HD",
			"description": null,
			"url": "\/hd",
			"sponsor-tag": false,
			"pornstar": false
		}, {
			"name": "America Naughty",
			"url": "\/tags\/america-naughty",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "131378"
		}, {
			"name": "Big Fat",
			"url": "\/tags\/big-fat",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "12548"
		}, {
			"name": "Gro\u00df",
			"url": "\/tags\/big",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "77647"
		}, {
			"name": "Gro\u00dfe Br\u00fcste",
			"url": "\/tags\/big-boobs",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "47"
		}, {
			"name": "In America",
			"url": "\/tags\/in-america",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "105206"
		}, {
			"name": "In Face",
			"url": "\/tags\/in-face",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "82396"
		}, {
			"name": "In Your Face",
			"url": "\/tags\/in-your-face",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "10907"
		}, {
			"name": "Naughty",
			"url": "\/tags\/naughty",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "8348"
		}],
		"sponsor": {
			"id": 1613,
			"site": "Naughty America",
			"banner": {
				"width": 638,
				"height": 60,
				"src": "https:\/\/thumb-v-cl.xhcdn.com\/site\/000\/001\/613\/desktop.jpg.v1533717727"
			},
			"name": "",
			"message": "Find your fantasy with todays hottest porn stars",
			"link": "https:\/\/natour.naughtyamerica.com\/track\/xhamster.12.8.8.0.0.0.0.0",
			"landing": 0,
			"description": ""
		},
		"reported": false,
		"editable": false,
		"subscriptionModel": {
			"modelName": "channelModel",
			"id": 40829,
			"subscribed": false,
			"subscribers": 8382
		},
		"author": {
			"modelName": "shortUserModel",
			"id": 2942338,
			"pageURL": "https:\/\/de.xhamster.com\/users\/naughtyamerica",
			"retired": false,
			"verified": false,
			"name": "NaughtyAmerica"
		}
	},
	"relatedVideosPagination": {
		"active": 1,
		"next": 2,
		"prev": 0,
		"buttonClass": "",
		"minPage": 1,
		"maxPage": 4,
		"maxPages": 10,
		"pageLinkTemplate": "",
		"pageLinkFirst": ""
	},
	"commentsCollection": [{
		"modelName": "commentModel",
		"id": 54068982,
		"userId": 4984757,
		"itemId": 0,
		"text": "plastic tits",
		"created": 1514780445,
		"metaItemprop": true,
		"author": {
			"lastActive": null,
			"editable": false,
			"vip": false,
			"personalInfo": {
				"gender": {"name": "male", "icon": "male-new blue", "label": "M\u00e4nnlich"},
				"orientation": {"name": "heterosexual", "icon": "straight", "label": "Heterosexuell"},
				"geo": {"countryCode": "DE", "countryName": "Germany"},
				"birthday": -62169984000
			},
			"modelName": "userModel",
			"thumbURL": "https:\/\/thumb-v.xhcdn.com\/user\/004\/984\/757\/avatar_80.jpg.v1498040849",
			"isOnline": false,
			"id": 4984757,
			"pageURL": "https:\/\/de.xhamster.com\/users\/nemoralis1",
			"retired": false,
			"verified": false,
			"name": "nemoralis1"
		}
	}, {
		"modelName": "commentModel",
		"id": 53252921,
		"userId": 3593115,
		"itemId": 0,
		"text": "good one",
		"created": 1512670768,
		"metaItemprop": true,
		"author": {
			"lastActive": null,
			"editable": false,
			"vip": false,
			"personalInfo": {
				"gender": {
					"name": "couple",
					"icon": "male-female-couple",
					"label": "P\u00e4rchen aus Mann und Frau"
				},
				"orientation": null,
				"geo": {"countryCode": "US", "countryName": "United States"},
				"birthday": -62169984000
			},
			"modelName": "userModel",
			"thumbURL": "https:\/\/thumb-v.xhcdn.com\/user\/003\/593\/115\/avatar_80.png.v1536687637",
			"isOnline": false,
			"id": 3593115,
			"pageURL": "https:\/\/de.xhamster.com\/users\/southernexposures",
			"retired": false,
			"verified": false,
			"name": "SouthernExposures"
		}
	}],
	"xplayerSettings": {
		"videoId": 8653702,
		"poster": "https:\/\/thumb-v-cl2.xhcdn.com\/a\/2HwiMvEEBePzYrgSRBLl9g\/008\/653\/702\/1280x720.4.jpg",
		"duration": 275,
		"fallback": {"fallbackImageClass": "xplayer-fallback-image"},
		"hlsConfig": {
			"libSrc": "https:\/\/static-cl.xhcdn.com\/js\/hls.js",
			"maxBufferLength": 10,
			"maxBufferSize": 10000000,
			"maxMaxBufferLength": 120,
			"levelLoadingRetryDelay": 500,
			"levelLoadingMaxRetry": 3,
			"levelLoadingMaxRetryTimeout": 32000,
			"fragLoadingMaxRetry": 4,
			"fragLoadingRetryDelay": 500,
			"fragLoadingMaxRetryTimeout": 32000
		},
		"sources": {
			"standard": {
				"vp9": [{
					"url": "https:\/\/19-14.b.cdn13.com\/008\/653\/702\/720p.vp9.webm?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=314k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=ad269d50646d708f78442cb2f0ea2892",
					"fallback": "https:\/\/video5.xhcdn.com\/key=Sf1bW4yBB8lwe9ktAM2ZGQ,end=1536858000,limit=3\/data=77.180.197.184-dvp\/speed=314k\/initial_buffer=318800\/008\/653\/702\/720p.vp9.webm",
					"quality": "720p",
					"label": "720p",
					"type": "HD"
				}],
				"h265": [{
					"url": "https:\/\/19-13.b.cdn13.com\/008\/653\/702\/720p.h265.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=226k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=4b976a1b7b7c543ff34280608b6d91cf",
					"fallback": "https:\/\/video4.xhcdn.com\/key=ovJ+qabrbm0VJwV3EpNLlA,end=1536858000,limit=3\/data=77.180.197.184-dvp\/speed=226k\/initial_buffer=318800\/008\/653\/702\/720p.h265.mp4",
					"quality": "720p",
					"label": "720p",
					"type": "HD"
				}],
				"mp4": [{
					"url": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/720p.h264.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=448k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=96ca7aaad459d81f0b01303b54ad20c2",
					"fallback": "https:\/\/video1.xhcdn.com\/key=98ooS4rL5EcYHi6FW2aDkg,end=1536858000,limit=3\/data=77.180.197.184-dvp\/speed=448k\/initial_buffer=318800\/008\/653\/702\/720p.h264.mp4",
					"quality": "720p",
					"label": "720p",
					"type": "HD"
				}, {
					"url": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/480p.h264.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=238k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=38fc4020bce89428f80cb339d72ce094",
					"fallback": "https:\/\/video1.xhcdn.com\/key=JgqNPHIZlbszhqHPIf9X5Q,end=1536858000,limit=3\/data=77.180.197.184-dvp\/speed=238k\/initial_buffer=318800\/008\/653\/702\/480p.h264.mp4",
					"quality": "480p",
					"label": "480p",
					"type": ""
				}, {
					"url": "https:\/\/19-10.b.cdn13.com\/008\/653\/702\/240p.h264.mp4?cdn_creation_time=1536843600&cdn_ttl=14400&cdn_bw=118k&cdn_bw_fs=312k&cdn_cv_data=77.180.197.184-dvp&cdn_hash=e5ef9d46c5dbe941ec9528e35ee70a28",
					"fallback": "https:\/\/video1.xhcdn.com\/key=wO+ypgQfOSKAX5MiWEwAuw,end=1536858000,limit=3\/data=77.180.197.184-dvp\/speed=118k\/initial_buffer=318800\/008\/653\/702\/240p.h264.mp4",
					"quality": "240p",
					"label": "240p",
					"type": ""
				}]
			}
		},
		"debug": false
	},
	"xplayerPluginSettings": {
		"ads": {
			"serverUrl": "",
			"skipAdjustment": 9,
			"mobileStyles": false,
			"skipOffset": 10,
			"maxSkipOffset": 10,
			"abortServerTimeout": 3,
			"trackGA": true,
			"trackGACollect": ["hideAd"],
			"trackCollector": false,
			"trackCollectorExtra": {"isVr": false, "ab": false},
			"videoLinkDisable": true
		},
		"controlBar": {"largeMode": []},
		"thumbs": {
			"url": "https:\/\/thumb-v2.xhcdn.com\/a\/exEARJHel80J4yCristdog\/008\/653\/702\/160x160.50.s.jpg",
			"length": 50
		},
		"banner": {"bannerUrl": "", "show": false},
		"overlay": {
			"tabsDataUrl": "https:\/\/de.xhamster.com\/api\/flash.php?\/video\/info&video_id=8653702",
			"shareURL": "https:\/\/de.xhamster.com\/videos\/nina-elle-s-big-fat-bombs-in-your-face-naughty-america-8653702"
		},
		"context": {
			"pageURL": "https:\/\/de.xhamster.com\/videos\/nina-elle-s-big-fat-bombs-in-your-face-naughty-america-8653702",
			"embedCode": "<iframe src=\"https:\/\/de.xhamster.com\/embed\/8653702\" width=\"510\" height=\"400\" frameborder=\"0\"  scrolling=\"no\" allowfullscreen><\/iframe>"
		},
		"keyboard": {"noFocus": true},
		"statistics": {
			"buffStats": false,
			"errorStats": true,
			"addFields": {"player": "xplayer-tpl3", "maxQuality": "720p"}
		}
	},
	"isVideoViewDurationNeeded": false,
	"partnersCounter": {"server": "m61", "counter": true},
	"downloadNoDialog": false,
	"downloadBanner": {
		"widgetName": "widgetDownload",
		"autoplay": false,
		"widgetTrackingUrl": null,
		"titleLink": "https:\/\/de.xhamster.com\/stripchat\/out?userId=aad1b133c9c4764c297d099d98d58aef&utm_source=xhamster&memberId=&utm_medium=widgets&sourceId=widgets&platform=desktop-new&landing=WidgetXH&domain=xhamsterlive&orientation=straight&pageType=videoPage&categoryName=Not-Webcams&widgetName=widgetDownload&widgetElement=widgetTitleLink&isUserLogged=1",
		"moreGirlsLink": "https:\/\/de.xhamster.com\/stripchat\/out?userId=aad1b133c9c4764c297d099d98d58aef&utm_source=xhamster&memberId=&utm_medium=widgets&sourceId=widgets&platform=desktop-new&landing=WidgetXH&domain=xhamsterlive&orientation=straight&pageType=videoPage&categoryName=Not-Webcams&widgetName=widgetDownload&widgetElement=moreButton&isUserLogged=1",
		"logoLink": "https:\/\/de.xhamster.com\/stripchat\/out?userId=aad1b133c9c4764c297d099d98d58aef&utm_source=xhamster&memberId=&utm_medium=widgets&sourceId=widgets&platform=desktop-new&landing=WidgetXH&domain=xhamsterlive&orientation=straight&pageType=videoPage&categoryName=Not-Webcams&widgetName=widgetDownload&widgetElement=widgetLogoBlock&isUserLogged=1",
		"favorite": false,
		"thumbLink": "https:\/\/de.xhamster.com\/stripchat\/out?userId=aad1b133c9c4764c297d099d98d58aef&utm_source=xhamster&url=%2F%7Btitle%7D&memberId=&utm_medium=widgets&sourceId=widgets&platform=desktop-new&landing=WidgetXH&domain=xhamsterlive&orientation=straight&pageType=videoPage&categoryName=Not-Webcams&widgetName=widgetDownload&widgetElement=widgetThumbnail&isUserLogged=1",
		"frontObject": "{&quot;widgetName&quot;:&quot;widgetDownload&quot;,&quot;widgetTrackingUrl&quot;:null,&quot;favorite&quot;:false,&quot;autoplay&quot;:false}"
	},
	"plAds": {"enable": false, "frameURL": ""},
	"preroll": false,
	"vr": {
		"type": "",
		"framePack": "",
		"angle": "",
		"sources": "",
		"poster": "https:\/\/thumb-v-cl2.xhcdn.com\/a\/2HwiMvEEBePzYrgSRBLl9g\/008\/653\/702\/1280x720.4.jpg"
	},
	"vrStats": true,
	"urls": {
		"camsWidget": "https:\/\/de.xhamster.com\/ajax\/wid-cams-widget\/list?categories=blonde%2Ccumshot%2Chd_videos%2Ccheating%2Cbig_tits%2Cbig_cock&orientation=0",
		"stories": "https:\/\/de.xhamster.com\/stories\/de",
		"photos": "https:\/\/de.xhamster.com\/photos",
		"videosSearch": "https:\/\/de.xhamster.com\/search",
		"photosSearch": "https:\/\/de.xhamster.com\/search\/photos",
		"channelsTop": "https:\/\/de.xhamster.com\/channels\/all\/best",
		"pornstarsTop": "https:\/\/de.xhamster.com\/pornstars\/all\/best",
		"storiesSearch": "https:\/\/de.xhamster.com\/search\/stories",
		"dating": "https:\/\/de.xhamster.com\/dating",
		"faq": "https:\/\/de.xhamster.com\/info\/faq",
		"backUrl": null,
		"myProfile": "https:\/\/de.xhamster.com\/users\/dirtytom74",
		"myProfileEdit": "https:\/\/de.xhamster.com\/my\/edit\/profile",
		"myMessages": "https:\/\/de.xhamster.com\/my\/messages",
		"myMessagesOnline": "https:\/\/de.xhamster.com\/my\/messages\/online",
		"myMessagesUnread": "https:\/\/de.xhamster.com\/my\/messages\/unread",
		"myFavorites": "https:\/\/de.xhamster.com\/my\/favorites\/videos",
		"myVideos": "https:\/\/de.xhamster.com\/my\/videos",
		"myGalleries": "https:\/\/de.xhamster.com\/my\/photos",
		"myBlog": "https:\/\/de.xhamster.com\/my\/blog",
		"mySubscriptions": "https:\/\/de.xhamster.com\/my\/subscriptions",
		"myNews": "https:\/\/de.xhamster.com\/my\/subscriptions\/news",
		"myPurchases": "https:\/\/de.xhamster.com\/my\/purchases",
		"myFriends": "https:\/\/de.xhamster.com\/my\/friends",
		"myUploadStory": "https:\/\/de.xhamster.com\/upload\/story",
		"myUploadPost": "https:\/\/de.xhamster.com\/upload\/post",
		"uploadHost": "\/\/upload9.xhamster.com",
		"myUploadVideo": "https:\/\/de.xhamster.com\/upload",
		"myUploadPhotos": "https:\/\/de.xhamster.com\/upload\/photos"
	},
	"camsData": [{
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1536844320\/3159007",
		"id": 3159007,
		"country": "",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/f\/b\/2\/fb2783b3aaf316440ec274fd2759fccd-full",
		"broadcastGender": "female",
		"snapshotServer": "eu1",
		"tags": ["autoTagPopular", "female", "ageTeen", "bodyTypePetite", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTalk", "doPlayGames", "doFootFetish", "subcultureRomantic"],
		"username": "Buffy",
		"languages": ["en"],
		"stripScore": 830.5,
		"token": "582620f3e699d53592ade3c0e9dcb70b"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1536844308\/6408826",
		"id": 6408826,
		"country": "ro",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/9\/a\/19a248a63eed15524ec3b4e8938f85b3-full",
		"broadcastGender": "female",
		"snapshotServer": "eu6",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypePetite", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doShower", "doTalk", "doPlayGames", "doSexToys", "doAnal", "doSquirt", "doFootFetish", "doAnalPlug", "doDildo", "doCreamPie", "doFingering", "doDoggyStyle", "specificsPiercing", "subcultureRomantic"],
		"username": "Sabrina_way",
		"languages": ["en"],
		"stripScore": 799.75,
		"token": "512af522503b6d65a70bbfbccc7e2aaf"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/4861801",
		"id": 4861801,
		"country": "gb",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/f\/1\/5f1c29f92bb88682b273aa6c96393b13-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "female", "ageTeen", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTalk", "doYoga", "doTopless", "doPlayGames", "doSquirt", "doBlowjob", "doFootFetish", "specificsBigAss"],
		"username": "emilycandybloom",
		"languages": ["en"],
		"stripScore": 886.25,
		"token": "85ec6306105d0e269cb3fede473fcb41"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1536844308\/6327931",
		"id": 6327931,
		"country": "de",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/4\/e\/44ede3b48bdeb1d3e4a76f8187d162fc-full",
		"broadcastGender": "female",
		"snapshotServer": "eu6",
		"tags": ["autoTagPopular", "female", "ageMilf", "bodyTypeCurvy", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doTopless", "doPlayGames", "doRolePlay", "doSexToys", "doOil", "doAnal", "doFootFetish", "specificsPiercing", "tagLanguageGerman", "specificsBigAss", "specificsTattoos"],
		"username": "Sally_Secret",
		"languages": ["en", "de"],
		"stripScore": 1263.93,
		"token": "bc3ebea5d8970045db7c0cc4922d6d1a"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1536844314\/3654557",
		"id": 3654557,
		"country": "lv",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/3\/7\/437671c88440e34ac61ea1fc86a6929b-full",
		"broadcastGender": "female",
		"snapshotServer": "eu5",
		"tags": ["autoTagPopular", "female", "ageMilf", "bodyTypePetite", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doYoga", "doPlayGames", "doTwerk", "doSexToys", "doOil", "doOhmibod", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "subcultureRomantic"],
		"username": "DaLie",
		"languages": ["en"],
		"stripScore": 877.25,
		"token": "976ac29b50ef17b2c78cd9c8e09b3776"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1536844303\/8221047",
		"id": 8221047,
		"country": "ca",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/6\/5\/565cf7986cc511cdf6698c7b8009091a-full",
		"broadcastGender": "female",
		"snapshotServer": "eu7",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doTopless", "doNonNude", "doPlayGames", "doOil", "doFootFetish", "doStriptease", "doFingering", "specificsBigTits", "specificShaven", "subcultureRomantic"],
		"username": "RitaMoors",
		"languages": ["en"],
		"stripScore": 800.5,
		"token": "6df188c180d559f7a5980cbfa4952ba3"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu2\/previews\/1536844319\/8960155",
		"id": 8960155,
		"country": "ee",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/e\/1\/2\/e12ccd2d612b2d50c562ad18841e9910-full",
		"broadcastGender": "group",
		"snapshotServer": "eu2",
		"tags": ["autoTagPopular", "autoTagNew", "female", "autoTagCouples", "ageTwenties", "bodyTypeAthletic", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "autoTagInteractiveToy", "doHardcore", "doDance", "doTopless", "doPlayGames", "doOil", "doOhmibod", "autoTagLovense", "doBlowjob", "doFootFetish", "doDeepThroat", "doTittyFuck", "doFingering", "do69Position", "doDoggyStyle", "specificInterracial", "specificsPiercing", "specificsBigAss", "specificsBigTits", "specificsTattoos", "specificShaven", "subcultureStudent"],
		"username": "JohnnyforLea",
		"languages": ["en", "ru"],
		"stripScore": 962.25,
		"token": "b65be7adf4e0747e09ff52114777dd96"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1536844307\/3810735",
		"id": 3810735,
		"country": "ru",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/3\/5\/53520d7c08d4538f9a26392f506404ef-full",
		"broadcastGender": "female",
		"snapshotServer": "eu4",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypePetite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "autoTagInteractiveToy", "doDance", "doTalk", "doPlayGames", "doFuckMachine", "doSexToys", "doOil", "doOhmibod", "autoTagLovense", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsPiercing", "specificsTattoos"],
		"username": "_SeXyBLoNdE_",
		"languages": ["en", "ru"],
		"stripScore": 902.25,
		"token": "6a2d58137f4ff37286bea2e52848bd50"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1536844303\/4555984",
		"id": 4555984,
		"country": "",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/7\/2\/1\/7212e4408d0dbe8d65a3ec82ed18ee19-full",
		"broadcastGender": "female",
		"snapshotServer": "eu7",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypePetite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doShower", "doTalk", "doYoga", "doTopless", "doPlayGames", "doTwerk", "doOil", "doFootFetish"],
		"username": "rosaLolipop",
		"languages": ["en"],
		"stripScore": 825,
		"token": "24dd3a38c5d1610459625741230ae5fe"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/2389801",
		"id": 2389801,
		"country": "si",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/e\/1\/c\/e1c89df1aabbce0c2f9f232365538145-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypeAthletic", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doShower", "doTalk", "doYoga", "doTopless", "doPlayGames", "doTwerk", "doRolePlay", "doOil", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsBigAss", "specificsHairy", "specificsTattoos", "subcultureRomantic"],
		"username": "Lilu_Blond",
		"languages": ["en", "ru"],
		"stripScore": 956.75,
		"token": "00c456d3319a0a43864363fb67acc8a9"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1536844320\/5165703",
		"id": 5165703,
		"country": "de",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/e\/d\/a\/eda47b3f9f6839183b26c93fcbe69a4b-full",
		"broadcastGender": "female",
		"snapshotServer": "eu1",
		"tags": ["autoTagPopular", "female", "bodyTypeCurvy", "hairColorBlonde", "privatePriceThirtyTwoSixty", "autoTagInteractiveToy", "doDance", "doTopless", "doPlayGames", "doRolePlay", "doSexToys", "doOil", "autoTagLovense", "doAnal", "doSquirt", "tagLanguageGerman", "specificsBigAss", "specificsBigTits", "specificShaven"],
		"username": "zaunkoenigin1",
		"languages": ["de", "en"],
		"stripScore": 1271.4,
		"token": "67b50e7aa08045c90b850a8d221dc80e"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1536844320\/1110005",
		"id": 1110005,
		"country": "pl",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/f\/a\/3\/fa3120403a1f0ff209f93a347747ecd0-full",
		"broadcastGender": "female",
		"snapshotServer": "eu1",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypeAthletic", "ethnicityWhite", "hairColorBlonde", "privatePriceNinetyPlus", "autoTagInteractiveToy", "doDance", "doShower", "doTopless", "doPlayGames", "doSexToys", "doOil", "autoTagLovense", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsBigAss", "specificsBigTits", "specificShaven", "subcultureRomantic"],
		"username": "mary_sexy",
		"languages": ["en"],
		"stripScore": 927,
		"token": "9b99cfc45e73ea560a2619ac0b10e92e"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/6282300",
		"id": 6282300,
		"country": "gb",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/5\/d\/55d5813d6e8849d34a24f1d9c638f0b7-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "female", "ageMilf", "bodyTypeAthletic", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doPlayGames", "doOil", "doSquirt", "specificsBigTits", "subcultureRomantic"],
		"username": "divaroxy2018",
		"languages": ["en"],
		"stripScore": 919.5,
		"token": "bf0f39007ca73834492ed27a015f97a3"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us3\/previews\/1536844323\/6860545",
		"id": 6860545,
		"country": "co",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/2\/3\/6\/2360b0b544395b9d4b8f9719588cfdc7-full",
		"broadcastGender": "group",
		"snapshotServer": "us3",
		"tags": ["autoTagPopular", "female", "autoTagCouples", "ageTeen", "bodyTypeAthletic", "ethnicityLatino", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "autoTagInteractiveToy", "doDance", "doTalk", "doYoga", "doTopless", "doPlayGames", "doRolePlay", "doSexToys", "doOil", "autoTagLovense", "doAnal", "doBlowjob", "doFootFetish", "doCosplay", "do69Position", "doDoggyStyle", "specificInterracial", "tagLanguageFrench", "tagLanguageSpanish", "specificsBigAss", "specificsBigTits"],
		"username": "Magic_Secret",
		"languages": ["en", "es", "fr"],
		"stripScore": 983,
		"token": "e38931a60742960cc0b496dcfcc9a36f"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/6498728",
		"id": 6498728,
		"country": "it",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/e\/f\/d\/efd03c5031ee7338909a56898a0fe1d6-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "female", "ageMilf", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doPlayGames", "doOhmibod", "doAnal", "doSquirt", "doSmoking", "doDoggyStyle", "tagLanguageSpanish", "specificsTattoos"],
		"username": "lilia_fun",
		"languages": ["en", "it", "es"],
		"stripScore": 877.5,
		"token": "f2a26f00c2b491b4e8dc037caa033549"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1536844307\/9097791",
		"id": 9097791,
		"country": "ru",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/5\/b\/15b7612759bd0f5368a95996bd05c0b2-full",
		"broadcastGender": "female",
		"snapshotServer": "eu4",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageMilf", "ethnicityWhite", "hairColorBlonde", "privatePriceNinetyPlus", "doTopless", "doPlayGames", "doOffice", "doSexToys", "doOhmibod", "doAnal", "doSquirt", "doFootFetish", "doFingering", "doDoggyStyle", "specificsBigTits", "subcultureSwingers"],
		"username": "Mrs_Smith",
		"languages": ["en", "ru"],
		"stripScore": 982.5,
		"token": "4ad5c09737ac39fc8740e69d71410148"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/8857731",
		"id": 8857731,
		"country": "kr",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/9\/3\/2\/9322e85a4fac6c6d2c6b9dbe26dc7df2-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageTwenties", "bodyTypePetite", "ethnicityAsian", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "autoTagInteractiveToy", "doShower", "doTopless", "doPlayGames", "doSexToys", "doOil", "doOhmibod", "autoTagLovense", "doNippleToys", "doFingering", "doAnalBeads", "specificSmallTits", "specificShaven", "subcultureRomantic"],
		"username": "Nymph_Sarah",
		"languages": ["en"],
		"stripScore": 810.5,
		"token": "e34af72a5dcf22c659b22031d5bfd005"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu2\/previews\/1536844319\/8628729",
		"id": 8628729,
		"country": "lv",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/c\/4\/c\/c4c48e1568881c3c9990350a8d9dc712-full",
		"broadcastGender": "female",
		"snapshotServer": "eu2",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doPlayGames", "doTwerk", "doFootFetish"],
		"username": "BettyMeel",
		"languages": ["en"],
		"stripScore": 928.5,
		"token": "7035c5cb84ce67d11cf2cc0b36503d49"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1536844303\/8916521",
		"id": 8916521,
		"country": "ro",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/c\/0\/5\/c05b9abb409ffbb2868858b60de3a9f5-full",
		"broadcastGender": "female",
		"snapshotServer": "eu7",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTalk", "doPlayGames", "doSexToys", "doOil", "doAnal", "doBlowjob", "doTittyFuck", "doStriptease", "specificsBigTits", "specificsTattoos", "subcultureRomantic"],
		"username": "RachelLeggy",
		"languages": ["en"],
		"stripScore": 931.5,
		"token": "60a2eb6adfeb204c346dcf7ea4dad9b8"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/2401377",
		"id": 2401377,
		"country": "ro",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/d\/9\/1\/d9151781b43583a923a5122da755024c-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "female", "ageTeen", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "autoTagInteractiveToy", "doDance", "doTalk", "doTopless", "doNonNude", "doPlayGames", "doRolePlay", "doSexToys", "doOhmibod", "autoTagLovense", "doSquirt", "doFootFetish", "doStriptease", "doDoggyStyle", "specificsPiercing", "specificsBigAss", "specificsTattoos", "specificSmallTits"],
		"username": "AliceCllark",
		"languages": ["en"],
		"stripScore": 917.5,
		"token": "55d79d6f996124067d9cc8781fe1bbd2"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1536844320\/8161537",
		"id": 8161537,
		"country": "gb",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/3\/a\/13a1ba941c13acb174621a3195fb33d1-full",
		"broadcastGender": "female",
		"snapshotServer": "eu1",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityLatino", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doShower", "doTalk", "doTopless", "doPlayGames", "doFuckMachine", "doSexToys", "doOil", "doAnal", "doSquirt", "doFootFetish", "doAnalPlug", "doDildo", "specificsBigAss"],
		"username": "Challengeme1",
		"languages": ["en"],
		"stripScore": 951,
		"token": "be4d239bbb5b00a11fab7e87f12527e8"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1536844303\/9140330",
		"id": 9140330,
		"country": "lv",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/2\/0\/d\/20d5511111e4c74aa4fd2388af9c3725-full",
		"broadcastGender": "female",
		"snapshotServer": "eu7",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageTeen", "bodyTypeCurvy", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doTopless", "doNonNude", "doPlayGames", "doTwerk", "doSexToys", "doOil", "doOhmibod", "specificShaven", "subcultureHousewives"],
		"username": "Susanna_Fun",
		"languages": ["en"],
		"stripScore": 875.75,
		"token": "8ae2c4bb9285646bd45eb707eabb0e8c"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1536844307\/8841665",
		"id": 8841665,
		"country": "hu",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/8\/1\/c\/81c6db6b7e0bbc002bdf628b0f8e91fa-full",
		"broadcastGender": "female",
		"snapshotServer": "eu4",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageOld", "bodyTypeBBW", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doTopless", "doNonNude", "doPlayGames", "doSexToys", "doOil", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsBigAss", "specificsBigTits", "specificShaven"],
		"username": "classylyddia",
		"languages": ["en", "hu"],
		"stripScore": 857,
		"token": "ab3223867b426d367b71fde2977f6271"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us6\/previews\/1536844268\/7693042",
		"id": 7693042,
		"country": "co",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/2\/a\/0\/2a0b89eb80cfe9ce90b9f846e504308e-full",
		"broadcastGender": "group",
		"snapshotServer": "us6",
		"tags": ["autoTagPopular", "female", "autoTagCouples", "ageTwenties", "bodyTypeAthletic", "ethnicityLatino", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "autoTagInteractiveToy", "doTalk", "doPlayGames", "doTwerk", "doRolePlay", "doSexToys", "doOil", "autoTagLovense", "doAnal", "doSquirt", "doBlowjob", "doNippleToys", "doDeepThroat", "doStriptease", "doDoggyStyle", "specificInterracial", "tagLanguageSpanish", "specificsBigAss", "specificsBigTits", "specificsTattoos"],
		"username": "excitedcouple21",
		"languages": ["es", "en"],
		"stripScore": 852.5,
		"token": "13a986da945be7b7bc8c7fd15c3d2dee"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1536844303\/6280822",
		"id": 6280822,
		"country": "",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/d\/3\/4d3906a66c2b3e1208d9eb94ef4dbfd4-full",
		"broadcastGender": "female",
		"snapshotServer": "eu7",
		"tags": ["autoTagPopular", "female", "ageMilf", "bodyTypeCurvy", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "autoTagInteractiveToy", "doDance", "doTalk", "doTopless", "doPlayGames", "doTwerk", "doRolePlay", "doOil", "doOhmibod", "autoTagLovense", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsBigAss", "subcultureRomantic"],
		"username": "Sly_Oksi",
		"languages": [],
		"stripScore": 831.25,
		"token": "72cece6f8d3743712c192c21399adf37"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us7\/previews\/1536844284\/9144705",
		"id": 9144705,
		"country": "ar",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/9\/a\/59ae1219bee4d99671a69f5462000e2c-full",
		"broadcastGender": "female",
		"snapshotServer": "us7",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageTwenties", "bodyTypeCurvy", "ethnicityLatino", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTopless", "doPlayGames", "doTwerk", "doStriptease", "tagLanguageSpanish", "specificsBigAss"],
		"username": "keitlovexxx",
		"languages": ["es"],
		"stripScore": 835.5,
		"token": "ee7bfc94c206b631f72639ae5404ccd9"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/13558",
		"id": 13558,
		"country": "vg",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/7\/4\/474ede3cd36dbda65cd33d65315ce9ea-full",
		"broadcastGender": "female",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "female", "bodyTypePetite", "ethnicityWhite", "hairColorBlonde", "privatePriceNinetyPlus", "autoTagInteractiveToy", "doHardcore", "doDance", "doTalk", "doPlayGames", "doSexToys", "doOil", "doOhmibod", "autoTagLovense", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsTattoos", "subcultureRomantic"],
		"username": "Luxury_Dreams",
		"languages": ["en"],
		"stripScore": 923,
		"token": "fa40f189fdb66712e8d1ec86f34ae58b"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1536844299\/3627215",
		"id": 3627215,
		"country": "zw",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/d\/6\/4d668118568d4401843708f06140d180-full",
		"broadcastGender": "female",
		"snapshotServer": "eu8",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doTopless", "doPlayGames", "doSexToys", "doOil", "doSquirt", "doBlowjob", "doFootFetish", "specificsBigTits", "subcultureGoth"],
		"username": "BustyVikci",
		"languages": ["en"],
		"stripScore": 798,
		"token": "82b4bc08877e0831f6509090dd5a4d5a"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1536844307\/4490029",
		"id": 4490029,
		"country": "ru",
		"gender": "females",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/a\/f\/2\/af2a9d9d783c87f93a3f16ea985c32e7-full",
		"broadcastGender": "group",
		"snapshotServer": "eu4",
		"tags": ["autoTagPopular", "female", "autoTagCouples", "ageTwenties", "bodyTypeCurvy", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "autoTagInteractiveToy", "doDance", "doYoga", "doTopless", "doPlayGames", "doRolePlay", "doSexToys", "doOil", "autoTagLovense", "doBlowjob", "doFootFetish", "doStriptease", "doFingering", "doFisting", "do69Position", "doDoggyStyle", "specificLesbians", "specificsBigAss", "specificsBigTits"],
		"username": "ChristyVi",
		"languages": ["en"],
		"stripScore": 981.75,
		"token": "84971ab59a1c95952397f219ead69ace"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1536844308\/8802336",
		"id": 8802336,
		"country": "ru",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/8\/c\/6\/8c6cd52d7fb1b1ccaeab86bcd2900311-full",
		"broadcastGender": "female",
		"snapshotServer": "eu6",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityAsian", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doYoga", "doTopless", "doPlayGames", "doTwerk", "doRolePlay", "doSexToys", "doOhmibod", "doAnal", "doBlowjob", "doFootFetish", "doStriptease", "doFingering"],
		"username": "Lillianloveyou",
		"languages": ["en"],
		"stripScore": 861.5,
		"token": "c16278ead9e490e2ba8759fb526d1213"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1536844299\/6201007",
		"id": 6201007,
		"country": "gb",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/6\/1\/b\/61b136227c3dd8d3469811949ced8b54-full",
		"broadcastGender": "female",
		"snapshotServer": "eu8",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypePetite", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTalk", "doPlayGames", "doTwerk", "doOil", "doOhmibod", "doAnal", "doBlowjob", "doFootFetish", "tagLanguageSpanish", "specificsBigAss", "subcultureGlamour"],
		"username": "LexxiLow",
		"languages": ["en", "es"],
		"stripScore": 977,
		"token": "fd474fe3e19744092bb58da289fdeb34"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1536844308\/3910079",
		"id": 3910079,
		"country": "ca",
		"gender": "females",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/9\/9\/b\/99b2bc56bc9070990398db1a6688b9d4-full",
		"broadcastGender": "group",
		"snapshotServer": "eu6",
		"tags": ["autoTagPopular", "female", "autoTagCouples", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "autoTagInteractiveToy", "doHardcore", "doDance", "doShower", "doTalk", "doTopless", "doPlayGames", "doSexToys", "doOil", "doOhmibod", "autoTagLovense", "doAnal", "doBlowjob", "doFootFetish", "specificLesbians", "tagGroupSex", "tagLanguageFrench", "specificsBigAss", "specificsBigTits", "subcultureRomantic"],
		"username": "SophiaPearl",
		"languages": ["en", "fr"],
		"stripScore": 805.75,
		"token": "6afccd2c2c14e5fc4af879a3576f31d8"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/\/previews\/1536844350\/8783660",
		"id": 8783660,
		"country": "fi",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/a\/1\/8\/a18a2ddf11f572ead7678cb6f0c15ee7-full",
		"broadcastGender": "female",
		"snapshotServer": "",
		"tags": ["autoTagPopular", "autoTagNew", "female", "ageTeen", "bodyTypeBBW", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doShower", "doYoga", "doTopless", "doPlayGames", "doTwerk", "doRolePlay", "doSexToys", "specificsBigAss"],
		"username": "BritneyHolland",
		"languages": ["ru"],
		"stripScore": 942.5,
		"token": "0f3020db80c87ecdbf7c20974ced9f2d"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1536844299\/8453375",
		"id": 8453375,
		"country": "pl",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/d\/f\/a\/dfa697cfeaec105cfa1d1678502c8ae5-full",
		"broadcastGender": "female",
		"snapshotServer": "eu8",
		"tags": ["autoTagPopular", "female", "ageTeen", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doDance", "doTalk", "doTopless", "doPlayGames", "doRolePlay", "doOil", "doFootFetish", "doStriptease", "doFingering", "specificSmallTits", "specificShaven"],
		"username": "PollieVicks",
		"languages": ["en"],
		"stripScore": 872,
		"token": "1ce5018a6eb0de68f48ce149d2674e50"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1536844298\/8976031",
		"id": 8976031,
		"country": "ru",
		"gender": "maleFemale",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/0\/b\/40b9eb5702372967801da159dbeacfe9-full",
		"broadcastGender": "group",
		"snapshotServer": "eu3",
		"tags": ["autoTagPopular", "autoTagNew", "female", "autoTagCouples", "bodyTypeCurvy", "ethnicityWhite", "hairColorBlonde", "privatePriceSixteenToTwentyFour", "doHardcore", "doPlayGames", "doTwerk", "doSexToys", "doOhmibod", "doAnal", "doSquirt", "doBlowjob", "doDeepThroat", "doTittyFuck", "doStriptease", "doFingering", "do69Position", "specificInterracial", "specificsPiercing", "tagLanguageSpanish", "tagLanguageGerman", "specificsBigAss", "specificsBigTits", "specificsHairy", "specificsTattoos", "specificSmallTits", "specificShaven", "subcultureBdsm"],
		"username": "Conventual",
		"languages": ["en", "de", "es"],
		"stripScore": 823.5,
		"token": "7f2441bd778842c9745d9a81cc6328f0"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1536844314\/1135199",
		"id": 1135199,
		"country": "us",
		"gender": "females",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/d\/6\/a\/d6a5faff16933e3371720826c2c59f2d-full",
		"broadcastGender": "group",
		"snapshotServer": "eu5",
		"tags": ["autoTagPopular", "female", "autoTagCouples", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "autoTagInteractiveToy", "doDance", "doShower", "doTalk", "doPlayGames", "doOil", "doOhmibod", "autoTagLovense", "doBlowjob", "doFootFetish", "specificLesbians", "specificsBigAss", "specificsBigTits", "specificsTattoos", "subcultureRomantic"],
		"username": "LorennaMorgan",
		"languages": ["en"],
		"stripScore": 925.25,
		"token": "0523d30afd741f600cc391174fbd7348"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1536844307\/5630887",
		"id": 5630887,
		"country": "ua",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/f\/3\/2\/f322af2e9b345f03a967a27a476f8f1b-full",
		"broadcastGender": "female",
		"snapshotServer": "eu4",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "autoTagInteractiveToy", "doDance", "doShower", "doTalk", "doTopless", "doPlayGames", "doRolePlay", "doOil", "autoTagLovense", "doBlowjob", "doFootFetish", "doStriptease", "doFingering", "doCosplay", "specificsBigTits", "subcultureRomantic"],
		"username": "PrettieKate",
		"languages": ["en", "ru"],
		"stripScore": 979.75,
		"token": "d04cb4e9ccc71b15da4a04359992fd62"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu2\/previews\/1536844319\/736960",
		"id": 736960,
		"country": "gb",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/2\/3\/8\/238cdef73e945902bac17ea2d44b885b-full",
		"broadcastGender": "female",
		"snapshotServer": "eu2",
		"tags": ["autoTagPopular", "female", "ageMilf", "bodyTypeBBW", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doShower", "doTalk", "doYoga", "doPlayGames", "doSexToys", "doOil", "doOhmibod", "doAnal", "doSquirt", "doBlowjob", "doFootFetish", "specificsPiercing", "tagLanguageFrench", "tagLanguageGerman", "specificsBigAss", "specificsBigTits", "specificsHairy", "subcultureSwingers"],
		"username": "HardDPpentration",
		"languages": ["en", "de", "fr"],
		"stripScore": 922.5,
		"token": "7b7f358e1dc90aafa2786903256de62b"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1536844314\/7386300",
		"id": 7386300,
		"country": "lv",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/7\/5\/3\/753c4b1d84e142baa2e1d29fb9bc022f-full",
		"broadcastGender": "female",
		"snapshotServer": "eu5",
		"tags": ["autoTagPopular", "female", "ageTwenties", "bodyTypeCurvy", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTalk", "doTopless", "doPlayGames", "doTwerk", "doSexToys", "doOhmibod", "doAnal", "doFootFetish", "doStriptease", "doFingering", "doFisting", "doDoggyStyle", "specificsBigAss", "specificsBigTits", "specificsTattoos", "specificShaven", "subcultureBdsm"],
		"username": "Aliesone",
		"languages": ["en"],
		"stripScore": 799.5,
		"token": "bd2be2e20c8101dc7d28a66d1f9f0816"
	}, {
		"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1536844307\/7184688",
		"id": 7184688,
		"country": "bg",
		"gender": "female",
		"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/b\/b\/5bb78977c0eaf1b03a0f33ac54033beb-full",
		"broadcastGender": "female",
		"snapshotServer": "eu4",
		"tags": ["autoTagPopular", "female", "ageTwenties", "ethnicityWhite", "hairColorBlonde", "privatePriceThirtyTwoSixty", "doDance", "doTopless", "doPlayGames", "doSexToys", "doOhmibod", "doSquirt", "doBlowjob", "doFootFetish", "doTittyFuck", "doFisting", "specificsBigAss", "specificsHairy", "specificsTattoos", "specificSmallTits", "specificShaven", "subcultureStudent"],
		"username": "LadaDance",
		"languages": ["en"],
		"stripScore": 996.75,
		"token": "852e7c5600eed54cee2b38eb5c03db6d"
	}],
	"camsDataTagName": "Blondes",
	"stripchatWidgetSimilarModelsExperiment": {"links": {"old": "https:\/\/de.xhamster.com\/experiments\/stripchat\/ml-widget\/exp_9?type=old"}},
	"downloadVRApp": false,
	"favoritesVideoCollectionsCollection": [{
		"contentType": "videos",
		"default": true,
		"owner": 6898954,
		"created": 1505917832,
		"id": "59c27b88643dc514a96f730c",
		"modelName": "favoriteVideosCollectionModel",
		"modified": 1523468466,
		"quantity": 30,
		"title": "Standard-Sammlung",
		"pageURL": "https:\/\/de.xhamster.com\/my\/favorites\/videos"
	}],
	"favoriteEntity": null,
	"defaultVideoCollectionId": "59c27b88643dc514a96f730c",
	"options": {
		"reportReason": [{"id": 0, "text": "Model sieht zu jung aus, evtl. illegal"}, {
			"id": 2,
			"text": "Enth\u00e4lt Gewalt\/Vergewaltigung"
		}, {"id": 4, "text": "Kot"}, {"id": 5, "text": "Enth\u00e4lt Sex mit Tieren"}, {
			"id": 6,
			"text": "Falsche Kategorie",
			"items": [{"id": 8, "text": "Video geh\u00f6rt in M\u00e4nner-\/Schwule-Kategorien"}, {
				"id": 9,
				"text": "Video geh\u00f6rt in Shemale-Kategorien"
			}, {"id": 10, "text": "Andere", "input": true}]
		}]
	},
	"mlVideoRelated": {
		"is_ml_related": true,
		"is_sponsor": true,
		"categories": [{
			"name": "Naughty America",
			"url": "\/channels\/naughty-america",
			"sponsor-tag": true,
			"pornstar": false,
			"id": "40829"
		}, {
			"name": "Nina Elle",
			"url": "\/pornstars\/nina-elle",
			"sponsor-tag": false,
			"pornstar": true
		}, {
			"name": "Abspritzen",
			"url": "\/categories\/cumshot",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "18"
		}, {
			"name": "Blondinen",
			"url": "\/categories\/blonde",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "11"
		}, {
			"name": "Cheating",
			"url": "\/categories\/cheating",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "351"
		}, {
			"name": "Gro\u00dfe Titten",
			"url": "\/categories\/big-tits",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "671"
		}, {
			"name": "Gro\u00dfer Schwanz",
			"url": "\/categories\/big-cock",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "2807"
		}, {
			"name": "Videos HD",
			"description": null,
			"url": "\/hd",
			"sponsor-tag": false,
			"pornstar": false
		}, {
			"name": "America Naughty",
			"url": "\/tags\/america-naughty",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "131378"
		}, {
			"name": "Big Fat",
			"url": "\/tags\/big-fat",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "12548"
		}, {
			"name": "Gro\u00df",
			"url": "\/tags\/big",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "77647"
		}, {
			"name": "Gro\u00dfe Br\u00fcste",
			"url": "\/tags\/big-boobs",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "47"
		}, {
			"name": "In America",
			"url": "\/tags\/in-america",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "105206"
		}, {
			"name": "In Face",
			"url": "\/tags\/in-face",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "82396"
		}, {
			"name": "In Your Face",
			"url": "\/tags\/in-your-face",
			"sponsor-tag": false,
			"pornstar": false,
			"id": "10907"
		}, {"name": "Naughty", "url": "\/tags\/naughty", "sponsor-tag": false, "pornstar": false, "id": "8348"}]
	},
	"userComment": {
		"lastActive": 1536844365,
		"editable": true,
		"vip": false,
		"personalInfo": {
			"gender": {"name": "male", "icon": "male-new blue", "label": "M\u00e4nnlich"},
			"orientation": {"name": "heterosexual", "icon": "straight", "label": "Heterosexuell"},
			"geo": {"countryCode": "DE", "countryName": "Germany"},
			"birthday": 150422400
		},
		"modelName": "userModel",
		"thumbURL": "https:\/\/thumb-v.xhcdn.com\/user\/006\/898\/954\/avatar_80.jpg.v1498042022",
		"isOnline": true,
		"id": 6898954,
		"pageURL": "https:\/\/de.xhamster.com\/users\/dirtytom74",
		"retired": false,
		"verified": false,
		"name": "dirtytom74"
	},
	"gaSettings": {
		"events": [],
		"dimensions": {
			"dimension5": "straight",
			"dimension2": "XH New Design",
			"dimension6": "hd",
			"orientation": {}
		},
		"sampling": 25,
		"trackerId": "UA-23892695-1",
		"amp": true,
		"fields": {"anonymizeIp": true}
	},
	"staticURL": "https:\/\/static-cl.xhcdn.com\/xh-tpl3",
	"trustURLs": ["xhamsterlive.com", "xhamsterpremium.com", "stripchat.com", "xhamster.com"],
	"recaptchaKey": "6LeRuQYTAAAAAIIJzu4QOt24eoVgxL0Ff8a1g-vA",
	"isComeFromAmp": false,
	"userGender": "male",
	"isDesktopSite": true,
	"bannerPrefix": "wid-",
	"orientation": "straight",
	"isDesktop": true,
	"promo": "",
	"frontStats": false,
	"notificationsModel": {"gifts": 0, "messages": 0, "friends": 1, "notifications": 1},
	"userId": 6898954,
	"webpushEnabled": {"channel": false}
}
    """.trimIndent(),"""
{
	"visitFavorite": null,
	"videoModel": {
		"duration": 5356,
		"title": "Maximum perversum",
		"pageURL": "https:\/\/de.xhamster.com\/videos\/maximum-perversum-10168951",
		"icon": null,
		"spriteURL": "https:\/\/thumb-v1.xhcdn.com\/a\/oIPZ5N19W_gISxwMKkyWcg\/010\/168\/951\/160x160.50.s.jpg",
		"trailerURL": "https:\/\/thumb-v1.xhcdn.com\/a\/A1lEelV0-2NB1fRYNujIxg\/010\/168\/951\/240x135.t.mp4",
		"rating": {
			"modelName": "ratingModel",
			"value": 88,
			"entityModel": "videoModel",
			"entityID": 10168951,
			"likes": 28,
			"dislikes": 4,
			"state": 0
		},
		"isVR": false,
		"isHD": false,
		"isUHD": false,
		"created": 1537281310,
		"modelName": "videoModel",
		"thumbURL": "https:\/\/thumb-v-cl2.xhcdn.com\/a\/TtTpYWwiIACH0C-YLoslqg\/010\/168\/951\/1280x720.4.jpg",
		"id": 10168951,
		"views": 28138,
		"comments": 3,
		"modified": 0,
		"orientation": 0,
		"secured": 0,
		"status": 2,
		"description": "",
		"mp4File": "https:\/\/video.xhcdn.com\/key=+8EmW+vipooRFNA97aTQNw,end=1538172000,limit=3\/data=85.180.54.180-dvp\/speed=108k\/initial_buffer=4139712\/010\/168\/951\/240p.h264.mp4",
		"spriteCount": 50,
		"playerThumbURL": "https:\/\/static-cl.xhcdn.com\/images\/showcase.png",
		"sources": {
			"download": {
				"240p": {
					"link": "https:\/\/de.xhamster.com\/movies\/10168951\/download\/240p?t=1538160060&h=a4c8fdfee38d8172fcff952580412b37",
					"size": 280.46
				}
			},
			"mp4": {
				"240p": "https:\/\/video.xhcdn.com\/key=+8EmW+vipooRFNA97aTQNw,end=1538172000,limit=3\/data=85.180.54.180-dvp\/speed=108k\/initial_buffer=4139712\/010\/168\/951\/240p.h264.mp4"
			}
		},
		"dimensions": {
			"ext": "mp4",
			"v": 7,
			"cdn": 7,
			"cnt320p": 50,
			"trailer": {
				"version": 8,
				"160x120": 106,
				"240x180": 194,
				"240x135": 157,
				"320x180": 230,
				"320x240": 240
			},
			"encode-version": "1.20",
			"video": {
				"240p": {
					"vp9": 281547,
					"h265": 213266,
					"h264": 287193
				}
			},
			"ceph-cleaned": 2,
			"ml-thumb": 1
		},
		"categories": [
			{
				"name": "Deutsch",
				"url": "\/categories\/german",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "132"
			},
			{
				"name": "Pissen",
				"url": "\/categories\/pissing",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "42181"
			},
			{
				"name": "Vintage",
				"url": "\/categories\/vintage",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "51"
			},
			{
				"name": "Maximum",
				"url": "\/tags\/maximum",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "5402"
			}
		],
		"sponsor": [],
		"reported": false,
		"editable": false,
		"subscriptionModel": {
			"modelName": "userModel",
			"id": 6975575,
			"subscribed": false,
			"subscribers": 10615
		},
		"author": {
			"modelName": "shortUserModel",
			"id": 6975575,
			"pageURL": "https:\/\/de.xhamster.com\/users\/misfits64",
			"retired": false,
			"verified": false,
			"name": "misfits64"
		}
	},
	"relatedVideosPagination": {
		"active": 1,
		"next": 2,
		"prev": 0,
		"buttonClass": "",
		"minPage": 1,
		"maxPage": 4,
		"maxPages": 10,
		"pageLinkTemplate": "",
		"pageLinkFirst": ""
	},
	"commentsCollection": [
		{
			"modelName": "commentModel",
			"id": 65897297,
			"userId": 70694,
			"itemId": 0,
			"text": "thx",
			"created": 1537351153,
			"metaItemprop": true,
			"author": {
				"lastActive": null,
				"editable": false,
				"vip": false,
				"personalInfo": {
					"gender": {
						"name": "male",
						"icon": "male-new blue",
						"label": "M\u00e4nnlich"
					},
					"orientation": {
						"name": "heterosexual",
						"icon": "straight",
						"label": "Heterosexuell"
					},
					"geo": {
						"countryCode": "RO",
						"countryName": "Romania"
					},
					"birthday": -62169984000
				},
				"modelName": "userModel",
				"thumbURL": "https:\/\/thumb-v.xhcdn.com\/user\/000\/070\/694\/avatar_80.jpg.v1498041615",
				"isOnline": false,
				"id": 70694,
				"pageURL": "https:\/\/de.xhamster.com\/users\/csulak",
				"retired": false,
				"verified": false,
				"name": "csulak"
			}
		},
		{
			"modelName": "commentModel",
			"id": 65890584,
			"userId": 349928,
			"itemId": 0,
			"text": "delicious",
			"created": 1537317920,
			"metaItemprop": true,
			"author": {
				"lastActive": null,
				"editable": false,
				"vip": false,
				"personalInfo": {
					"gender": {
						"name": "male",
						"icon": "male-new blue",
						"label": "M\u00e4nnlich"
					},
					"orientation": {
						"name": "heterosexual",
						"icon": "straight",
						"label": "Heterosexuell"
					},
					"geo": {
						"countryCode": "AU",
						"countryName": "Australia"
					},
					"birthday": -62169984000
				},
				"modelName": "userModel",
				"thumbURL": "https:\/\/thumb-v.xhcdn.com\/user\/000\/349\/928\/avatar_80.jpg.v1498065199",
				"isOnline": false,
				"id": 349928,
				"pageURL": "https:\/\/de.xhamster.com\/users\/karen7",
				"retired": false,
				"verified": false,
				"name": "karen7"
			}
		},
		{
			"modelName": "commentModel",
			"id": 65879685,
			"userId": 5869460,
			"itemId": 0,
			"text": "great movie",
			"created": 1537288370,
			"metaItemprop": true,
			"author": {
				"lastActive": null,
				"editable": false,
				"vip": false,
				"personalInfo": {
					"gender": {
						"name": "couple",
						"icon": "male-female-couple",
						"label": "P\u00e4rchen aus Mann und Frau"
					},
					"orientation": {
						"name": "heterosexual",
						"icon": "straight",
						"label": "Heterosexuell"
					},
					"geo": {
						"countryCode": "DE",
						"countryName": "Germany"
					},
					"birthday": -62169984000
				},
				"modelName": "userModel",
				"thumbURL": "https:\/\/thumb-v.xhcdn.com\/user\/005\/869\/460\/avatar_80.jpg.v1498067702",
				"isOnline": false,
				"id": 5869460,
				"pageURL": "https:\/\/de.xhamster.com\/users\/babbsack",
				"retired": false,
				"verified": false,
				"name": "babbsack"
			}
		}
	],
	"xplayerSettings": {
		"videoId": 10168951,
		"duration": 5356,
		"fallback": {
			"fallbackImageClass": "xplayer-fallback-image"
		},
		"preload": false,
		"hlsConfig": {
			"libSrc": "https:\/\/static-cl.xhcdn.com\/js\/hls.js",
			"maxBufferLength": 30,
			"maxBufferSize": 10000000,
			"maxMaxBufferLength": 30,
			"maxBufferHole": 0.3,
			"maxSeekHole": 3,
			"levelLoadingRetryDelay": 500,
			"levelLoadingMaxRetry": 3,
			"levelLoadingMaxRetryTimeout": 32000,
			"fragLoadingMaxRetry": 4,
			"fragLoadingRetryDelay": 500,
			"fragLoadingMaxRetryTimeout": 32000
		},
		"sources": {
			"standard": {
				"vp9": [
					{
						"url": "https:\/\/video.xhcdn.com\/key=K-uI3d8kQyDBInjApSVVYg,end=1538172000,limit=3\/data=85.180.54.180-dvp\/speed=106k\/initial_buffer=4139712\/010\/168\/951\/240p.vp9.webm",
						"fallback": "https:\/\/19-9.b.cdn13.com\/010\/168\/951\/240p.vp9.webm?cdn_creation_time=1538157600&cdn_ttl=14400&cdn_bw=106k&cdn_bw_fs=4043k&cdn_cv_data=85.180.54.180-dvp&cdn_hash=cfb9d9162de5628e96fb9e271833b580",
						"quality": "240p",
						"label": "240p",
						"type": ""
					}
				],
				"h265": [
					{
						"url": "https:\/\/video.xhcdn.com\/key=Bw3whUxPh-y9XyWmAPYZbg,end=1538172000,limit=3\/data=85.180.54.180-dvp\/speed=80k\/initial_buffer=4139712\/010\/168\/951\/240p.h265.mp4",
						"fallback": "https:\/\/19-9.b.cdn13.com\/010\/168\/951\/240p.h265.mp4?cdn_creation_time=1538157600&cdn_ttl=14400&cdn_bw=80k&cdn_bw_fs=4043k&cdn_cv_data=85.180.54.180-dvp&cdn_hash=08eb4fa8d36c423683936d32e301c982",
						"quality": "240p",
						"label": "240p",
						"type": ""
					}
				],
				"mp4": [
					{
						"url": "https:\/\/video.xhcdn.com\/key=+8EmW+vipooRFNA97aTQNw,end=1538172000,limit=3\/data=85.180.54.180-dvp\/speed=108k\/initial_buffer=4139712\/010\/168\/951\/240p.h264.mp4",
						"fallback": "https:\/\/19-9.b.cdn13.com\/010\/168\/951\/240p.h264.mp4?cdn_creation_time=1538157600&cdn_ttl=14400&cdn_bw=108k&cdn_bw_fs=4043k&cdn_cv_data=85.180.54.180-dvp&cdn_hash=5c22439949d06f6799965e28f00ce79b",
						"quality": "240p",
						"label": "240p",
						"type": ""
					}
				]
			}
		},
		"debug": false
	},
	"xplayerPluginSettings": {
		"ads": {
			"serverUrl": "",
			"skipAdjustment": 9,
			"mobileStyles": false,
			"skipOffset": 10,
			"maxSkipOffset": 10,
			"abortServerTimeout": 3,
			"trackGA": true,
			"trackGACollect": [
				"hideAd"
			],
			"trackCollector": false,
			"trackCollectorExtra": {
				"isVr": false,
				"ab": false
			},
			"videoLinkDisable": true
		},
		"controlBar": {
			"largeMode": []
		},
		"poster": {
			"url": "https:\/\/thumb-v-cl2.xhcdn.com\/a\/TtTpYWwiIACH0C-YLoslqg\/010\/168\/951\/1280x720.4.jpg"
		},
		"thumbs": {
			"url": "https:\/\/thumb-v1.xhcdn.com\/a\/oIPZ5N19W_gISxwMKkyWcg\/010\/168\/951\/160x160.50.s.jpg",
			"length": 50
		},
		"banner": {
			"bannerUrl": "\/\/tsyndicate.com\/iframe2\/8ee254e5192944a0a7daddb6796db72a.html?categories=Vintage%2CGerman%2CMaximum%2CPissing&param1=1&param2=0&subid=%7C%7C%7Cother-user%7C&cdn=cdn.tsyndicate.com",
			"show": true
		},
		"overlay": {
			"tabsDataUrl": "https:\/\/de.xhamster.com\/api\/flash.php?\/video\/info&video_id=10168951",
			"shareURL": "https:\/\/de.xhamster.com\/videos\/maximum-perversum-10168951"
		},
		"context": {
			"pageURL": "https:\/\/de.xhamster.com\/videos\/maximum-perversum-10168951",
			"embedCode": "<iframe src=\"https:\/\/de.xhamster.com\/embed\/10168951\" width=\"510\" height=\"400\" frameborder=\"0\"  scrolling=\"no\" allowfullscreen><\/iframe>"
		},
		"keyboard": {
			"noFocus": true
		},
		"statistics": {
			"buffStats": false,
			"errorStats": true,
			"addFields": {
				"player": "xplayer-tpl3",
				"maxQuality": "240p"
			}
		}
	},
	"isVideoViewDurationNeeded": false,
	"partnersCounter": {
		"server": "m70",
		"counter": true
	},
	"downloadNoDialog": false,
	"downloadBanner": "<iframe allow='autoplay' frameborder='no' marginwidth='0' marginheight='0' scrolling='no' allowtransparency='true' align='middle' seamless='seamless' width=\"640px\" height=\"415px\" src=\"https:\/\/xhamsterpremium.com\/p\/xhamster-download?videoId=10168951&videoTitle=Maximum+perversum&videoCats%5B0%5D=German&videoCats%5B1%5D=Pissing&videoCats%5B2%5D=Vintage&sponsored=0&videoTags%5B0%5D=Maximum&orientation=straight&language=de&mode=0&host=de.xhamster.com&siteVersion=3\"><\/iframe>",
	"plAds": {
		"enable": true,
		"frameURL": "\/\/tsyndicate.com\/iframe2\/8ee254e5192944a0a7daddb6796db72a.html?categories=Vintage%2CGerman%2CMaximum%2CPissing&param1=1&param2=0&subid=%7C%7C%7Cother-user%7C&cdn=cdn.tsyndicate.com"
	},
	"preroll": true,
	"vr": {
		"type": "",
		"framePack": "",
		"angle": "",
		"sources": "",
		"poster": "https:\/\/thumb-v-cl2.xhcdn.com\/a\/TtTpYWwiIACH0C-YLoslqg\/010\/168\/951\/1280x720.4.jpg"
	},
	"vrStats": true,
	"urls": {
		"camsWidget": "https:\/\/de.xhamster.com\/ajax\/wid-cams-widget\/list?categories=vintage%2Cgerman%2Cpissing&orientation=0",
		"stories": "https:\/\/de.xhamster.com\/stories\/de",
		"photos": "https:\/\/de.xhamster.com\/photos",
		"videosSearch": "https:\/\/de.xhamster.com\/search",
		"photosSearch": "https:\/\/de.xhamster.com\/search\/photos",
		"channelsTop": "https:\/\/de.xhamster.com\/channels\/all\/best",
		"pornstarsTop": "https:\/\/de.xhamster.com\/pornstars\/all\/best",
		"storiesSearch": "https:\/\/de.xhamster.com\/search\/stories",
		"dating": "https:\/\/de.xhamster.com\/dating",
		"faq": "https:\/\/de.xhamster.com\/info\/faq",
		"backUrl": "https:\/\/go.xhamsterlive.com\/?userId=c530af9a70c77d029bb25b6ed1427de0&campaignId=e16dad9d9bf8c84ea7637e8bec57dc5255d68b22933eb49c1f78b5014fe75590",
		"switchVersionUrl": "https:\/\/de.xhamster.com\/switch"
	},
	"camsData": [
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us3\/previews\/1538159715\/9140619",
			"id": 9140619,
			"country": "dz",
			"gender": "females",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/a\/1\/e\/a1e1734e64a0323ed62e3405bf6dc68e-full",
			"broadcastGender": "group",
			"snapshotServer": "us3",
			"tags": [
				"autoTagPopular",
				"female",
				"autoTagCouples",
				"ageTwenties",
				"ethnicityLatino",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doHardcore",
				"doDance",
				"doShower",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doOhmibod",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"specificLesbians",
				"specificsPiercing",
				"specificPregnant",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsHairy",
				"specificsTattoos",
				"specificSmallTits",
				"specificShaven",
				"subcultureRomantic"
			],
			"username": "Pinkmuse",
			"languages": [
				"en",
				"es",
				"it",
				"fr",
				"de",
				"sq",
				"nl"
			],
			"stripScore": 969.75,
			"token": "78617368339f84a1ef2177f58d47e42c"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us2\/previews\/1538159958\/5452",
			"id": 5452,
			"country": "ca",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/0\/3\/f\/03f261d5b209a928db2c3568858c9287-full",
			"broadcastGender": "female",
			"snapshotServer": "us2",
			"tags": [
				"autoTagPopular",
				"female",
				"ageMilf",
				"ethnicityWhite",
				"hairColorBlack",
				"privatePriceThirtyTwoSixty",
				"doPublicPlace",
				"doDance",
				"doShower",
				"doTalk",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigTits"
			],
			"username": "a4pattes",
			"languages": [
				"en",
				"de",
				"es",
				"fr",
				"it"
			],
			"stripScore": 980.5,
			"token": "e1598337a155eb163aa638b6c5e05e0f"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/7308414",
			"id": 7308414,
			"country": "md",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/3\/9\/6\/396940a419e70caa347d0002a3a1727b-full",
			"broadcastGender": "female",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypeBBW",
				"ethnicityWhite",
				"hairColorBrown",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doRolePlay",
				"doSquirt",
				"doBlowjob",
				"doFootFetish",
				"doStriptease",
				"doFingering",
				"doSmoking",
				"doDoggyStyle",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificShaven",
				"subcultureStudent"
			],
			"username": "NatalieEllis",
			"languages": [
				"en",
				"de",
				"ru",
				"ro"
			],
			"stripScore": 601.75,
			"token": "8e6f9ae34a0c6dc66b1415723cc5a3f6"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us4\/previews\/1538159959\/8507983",
			"id": 8507983,
			"country": "co",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/9\/e\/19e2ba66fa3178d32a0b0878e04fd3de-full",
			"broadcastGender": "female",
			"snapshotServer": "us4",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"ethnicityLatino",
				"hairColorBlonde",
				"privatePriceThirtyTwoSixty",
				"autoTagInteractiveToy",
				"doPlayGames",
				"doSexToys",
				"autoTagLovense",
				"doSquirt",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificShaven"
			],
			"username": "aliccia_",
			"languages": [
				"es",
				"en",
				"de",
				"fr",
				"pt"
			],
			"stripScore": 589.25,
			"token": "09914f6e36c0de4319d62de0e9d04f07"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1538159943\/2884014",
			"id": 2884014,
			"country": "sk",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/6\/6\/5\/665e0a1c9ae8cc37f2807fcb058cf104-full",
			"broadcastGender": "female",
			"snapshotServer": "eu1",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypeAthletic",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doYoga",
				"doNonNude",
				"doPlayGames",
				"doTwerk",
				"doRolePlay",
				"doOil",
				"doOhmibod",
				"doFootFetish",
				"doDoggyStyle",
				"specificsPiercing",
				"tagLanguageGerman",
				"specificsBigTits",
				"specificsTattoos",
				"subcultureRomantic"
			],
			"username": "BritneyBest",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 694,
			"token": "63bbc609e78f5ac9dca0230c5edfaa8f"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1538159956\/1228417",
			"id": 1228417,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/0\/c\/40ceca99bd67191c869aa3850b1bf062-full",
			"broadcastGender": "female",
			"snapshotServer": "eu7",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doTalk",
				"doYoga",
				"doNonNude",
				"doPlayGames",
				"doAnal",
				"doBlowjob",
				"doFootFetish",
				"tagLanguageGerman",
				"specificsTattoos"
			],
			"username": "ViviCute18",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 569.25,
			"token": "00b3577bca9c142e737aac08edb5d32e"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/7414518",
			"id": 7414518,
			"country": "de",
			"gender": "maleFemale",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/b\/6\/4b681c94b6acc27a7616dd61c6a99fc3-full",
			"broadcastGender": "group",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"female",
				"autoTagCouples",
				"bodyTypePetite",
				"ethnicityAsian",
				"hairColorBlack",
				"privatePriceSixteenToTwentyFour",
				"doPublicPlace",
				"doHardcore",
				"doDance",
				"doTopless",
				"doPlayGames",
				"doTwerk",
				"doSexToys",
				"doOil",
				"doAnal",
				"doSquirt",
				"doSmoking",
				"specificInterracial",
				"tagGroupSex",
				"tagLanguageGerman",
				"specificSmallTits",
				"specificShaven",
				"subcultureHousewives"
			],
			"username": "morgo1997",
			"languages": [
				"en",
				"ru",
				"de"
			],
			"stripScore": 612.75,
			"token": "ef75270aacbe43d64dce57ae2ce4dcf0"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1538159957\/4385467",
			"id": 4385467,
			"country": "",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/b\/e\/c\/bec149e69ceec9a8af1abab96140db0e-full",
			"broadcastGender": "female",
			"snapshotServer": "eu4",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doYoga",
				"doNonNude",
				"doPlayGames",
				"doTwerk",
				"doOhmibod",
				"doDoggyStyle",
				"tagLanguageGerman",
				"subcultureMistresses",
				"subcultureBdsm"
			],
			"username": "NadyaBeauty",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 739.75,
			"token": "685031815c4ffc9af8d991884208174b"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/8198326",
			"id": 8198326,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/e\/6\/4\/e647ce92d594166275773f40079c4c93-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doNonNude",
				"doPlayGames",
				"doTwerk",
				"doFootFetish",
				"tagLanguageGerman",
				"specificsBigTits",
				"subcultureRomantic"
			],
			"username": "steffi_soft",
			"languages": [
				"de",
				"en"
			],
			"stripScore": 661.25,
			"token": "18e556f2857d193730f915445562d298"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1538159965\/375105",
			"id": 375105,
			"country": "au",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/b\/e\/2\/be23a1aeda7f2cd7d96a481b1efed29e-full",
			"broadcastGender": "female",
			"snapshotServer": "eu5",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypeAthletic",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doTalk",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doSquirt",
				"doBlowjob",
				"doFootFetish",
				"specificsPiercing",
				"tagLanguageFrench",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsTattoos",
				"subcultureRomantic"
			],
			"username": "NikkyBoobs",
			"languages": [
				"en",
				"de",
				"it",
				"fr"
			],
			"stripScore": 834.75,
			"token": "5cb336cf7c1827011869022367968382"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1538159953\/8009565",
			"id": 8009565,
			"country": "lv",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/e\/e\/1\/ee10e57fe7c639e88e5c69a001671dc4-full",
			"broadcastGender": "female",
			"snapshotServer": "eu6",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypeAthletic",
				"ethnicityWhite",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doYoga",
				"doPlayGames",
				"doTwerk",
				"doRolePlay",
				"doOil",
				"doBlowjob",
				"doFootFetish",
				"doDeepThroat",
				"doStriptease",
				"doFingering",
				"doDoggyStyle",
				"tagLanguageFrench",
				"tagLanguageGerman",
				"subcultureRomantic"
			],
			"username": "AuroraBeauty",
			"languages": [
				"en",
				"de",
				"it",
				"fr"
			],
			"stripScore": 859.25,
			"token": "9a4610e70c3096ba31ff7fb5fc18161e"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu2\/previews\/1538159969\/6158607",
			"id": 6158607,
			"country": "lv",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/0\/6\/d\/06d088d849d86f5313ae74f13fea3390-full",
			"broadcastGender": "female",
			"snapshotServer": "eu2",
			"tags": [
				"autoTagPopular",
				"female",
				"ageMilf",
				"bodyTypeCurvy",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceSixteenToTwentyFour",
				"autoTagInteractiveToy",
				"doPlayGames",
				"doSexToys",
				"autoTagLovense",
				"specificsPiercing",
				"tagLanguageFrench",
				"tagLanguageGerman",
				"specificsHairy",
				"subcultureRomantic"
			],
			"username": "ZoeBlair",
			"languages": [
				"en",
				"de",
				"fr",
				"ru",
				"pl"
			],
			"stripScore": 804.25,
			"token": "8a21d0312e7e838c62ce11d614a744a3"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1538159965\/2961167",
			"id": 2961167,
			"country": "",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/2\/6\/7\/26704959b444c03a8b0884c45a72d804-full",
			"broadcastGender": "female",
			"snapshotServer": "eu5",
			"tags": [
				"autoTagPopular",
				"female",
				"ageOld",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doTalk",
				"doPlayGames",
				"doRolePlay",
				"doFootFetish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsHairy",
				"subcultureRomantic"
			],
			"username": "EricaTop",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 610.25,
			"token": "9972d7e816ea805ac0ecb225edcd9774"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1538159943\/9094282",
			"id": 9094282,
			"country": "ru",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/b\/8\/5b8923f81d4f9e6e7c84b8631516274d-full",
			"broadcastGender": "female",
			"snapshotServer": "eu1",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doOil",
				"doDeepThroat",
				"doStriptease",
				"doFingering",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificSmallTits",
				"subcultureRomantic"
			],
			"username": "MerisSweet",
			"languages": [
				"en",
				"de",
				"es"
			],
			"stripScore": 613.5,
			"token": "2cb7954db94009b132fc0484155db9b8"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu2\/previews\/1538159969\/7372743",
			"id": 7372743,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/c\/b\/4cb371d72d44289498e61248aeb96a8b-full",
			"broadcastGender": "female",
			"snapshotServer": "eu2",
			"tags": [
				"autoTagPopular",
				"female",
				"ageMilf",
				"bodyTypeBBW",
				"ethnicityAsian",
				"hairColorBrown",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doOhmibod",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsHairy",
				"specificShaven",
				"subcultureRomantic"
			],
			"username": "HoneyAkira",
			"languages": [
				"en",
				"de",
				"ru"
			],
			"stripScore": 861,
			"token": "d10a62599edf7e8cc37252f58d044f15"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/13933",
			"id": 13933,
			"country": "de",
			"gender": "maleFemale",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/c\/7\/8\/c785fa19954c59ed8c5a65c28cb3bb10-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"female",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"autoTagInteractiveToy",
				"doHardcore",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doRolePlay",
				"doSexToys",
				"doOil",
				"autoTagLovense",
				"doAnal",
				"doSquirt",
				"doFootFetish",
				"doFingering",
				"doVaping",
				"specificsPiercing",
				"tagLanguageGerman",
				"specificsTattoos",
				"specificSmallTits",
				"specificShaven",
				"subcultureRomantic"
			],
			"username": "Jasmin-Million",
			"languages": [
				"de"
			],
			"stripScore": 1078.68,
			"token": "bd3a7aa6608d413fe789ad53fd7c438f"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/9520231",
			"id": 9520231,
			"country": "ua",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/a\/7\/a\/a7aaf951c01a7710e8e51816fa358955-full",
			"broadcastGender": "female",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"autoTagNew",
				"female",
				"ageMilf",
				"bodyTypeAthletic",
				"ethnicityLatino",
				"hairColorBlack",
				"privatePriceThirtyTwoSixty",
				"doPublicPlace",
				"doDance",
				"doShower",
				"doTalk",
				"doYoga",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doOhmibod",
				"doAnal",
				"doSquirt",
				"doFootFetish",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsHairy",
				"subcultureRomantic"
			],
			"username": "flouwer25cuoples",
			"languages": [
				"en",
				"es",
				"de",
				"zh",
				"ar"
			],
			"stripScore": 893.25,
			"token": "82ba4efed1326149bb36fe3b6be5ccc3"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu2\/previews\/1538159969\/4588441",
			"id": 4588441,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/0\/b\/1\/0b196c63f9c09233dfcfe2034027612b-full",
			"broadcastGender": "female",
			"snapshotServer": "eu2",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doYoga",
				"doTopless",
				"doPlayGames",
				"doOhmibod",
				"doFootFetish",
				"doNippleToys",
				"doStriptease",
				"doDoggyStyle",
				"tagLanguageGerman"
			],
			"username": "ReysiSan",
			"languages": [
				"en"
			],
			"stripScore": 489.25,
			"token": "db5e058cd9e477e48849ef7c959ff51d"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/8105200",
			"id": 8105200,
			"country": "ru",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/b\/2\/d\/b2d95c5f436b7c963a358d9ee562b5de-full",
			"broadcastGender": "female",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doOil",
				"doOhmibod",
				"doFootFetish",
				"doStriptease",
				"doFingering",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsTattoos",
				"specificSmallTits",
				"specificShaven",
				"subcultureStudent"
			],
			"username": "FoxxyRed",
			"languages": [
				"en",
				"de",
				"es",
				"fr"
			],
			"stripScore": 681.75,
			"token": "45a8b2baac7b840e722e4cbfb7004dec"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/4246740",
			"id": 4246740,
			"country": "",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/7\/7\/4774dc2eca6094f4c6a291b1202cb2c5-full",
			"broadcastGender": "female",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypeBBW",
				"ethnicityWhite",
				"hairColorBlack",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doNonNude",
				"doPlayGames",
				"doTwerk",
				"doRolePlay",
				"doFootFetish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits"
			],
			"username": "CECIL_25",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 586.5,
			"token": "c6889dc05c7d19c8a4b0cd99b1255199"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/16144",
			"id": 16144,
			"country": "gb",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/7\/0\/0\/700e34eb94f7176b0b9cd17674099dc5-full",
			"broadcastGender": "female",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doYoga",
				"doTopless",
				"doPlayGames",
				"doTwerk",
				"doRolePlay",
				"doSexToys",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"doDeepThroat",
				"doStriptease",
				"doFingering",
				"doDoggyStyle",
				"tagLanguageSpanish",
				"tagLanguageGerman"
			],
			"username": "BritneySummerXXX",
			"languages": [
				"en",
				"de",
				"es"
			],
			"stripScore": 523,
			"token": "0be8086a7b56ac664e40adb830389701"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1538159953\/4817746",
			"id": 4817746,
			"country": "",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/4\/8\/14895e847eacf878f23d00bbcd5ba465-full",
			"broadcastGender": "female",
			"snapshotServer": "eu6",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doPlayGames",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"subcultureRomantic"
			],
			"username": "Gloriia",
			"languages": [
				"en",
				"de",
				"es",
				"fr",
				"it",
				"nl"
			],
			"stripScore": 551.25,
			"token": "88b9773936bd2ab0a373c0d2652fa1ac"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1538159953\/5614995",
			"id": 5614995,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/d\/8\/4\/d840b6853c71751572640ef3b049aadb-full",
			"broadcastGender": "female",
			"snapshotServer": "eu6",
			"tags": [
				"autoTagPopular",
				"female",
				"ageOld",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceThirtyTwoSixty",
				"doTalk",
				"doYoga",
				"doNonNude",
				"doPlayGames",
				"doTwerk",
				"doOhmibod",
				"doFootFetish",
				"specificsPiercing",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificShaven",
				"subcultureGlamour"
			],
			"username": "margot_BANGS",
			"languages": [
				"de",
				"en"
			],
			"stripScore": 792.5,
			"token": "1d11545bc24cc7217db3520914b21a41"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/us5\/previews\/1538159954\/9487523",
			"id": 9487523,
			"country": "co",
			"gender": "maleFemale",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/2\/7\/e\/27ecacde364a69314ab968cef0227d94-full",
			"broadcastGender": "group",
			"snapshotServer": "us5",
			"tags": [
				"autoTagPopular",
				"autoTagNew",
				"female",
				"autoTagCouples",
				"bodyTypeBBW",
				"ethnicityLatino",
				"hairColorBlack",
				"privatePriceSixteenToTwentyFour",
				"doPlayGames",
				"doAnal",
				"doSquirt",
				"specificInterracial",
				"tagGroupSex",
				"specificsPiercing",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsTattoos",
				"specificShaven",
				"subcultureRomantic"
			],
			"username": "Group_all_Hot_Sex",
			"languages": [
				"en",
				"de",
				"es",
				"fr",
				"it"
			],
			"stripScore": 947.25,
			"token": "2aa99dc227f2512612d128f1e2a8d2d7"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1538159953\/8267806",
			"id": 8267806,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/5\/0\/3\/5039e5abad2c6206ee47f9732b2031c4-full",
			"broadcastGender": "female",
			"snapshotServer": "eu6",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"ethnicityWhite",
				"hairColorBlack",
				"privatePriceSixteenToTwentyFour",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doRolePlay",
				"doBlowjob",
				"doFootFetish",
				"doStriptease",
				"doFingering",
				"tagLanguageGerman",
				"specificsHairy",
				"specificSmallTits",
				"subcultureMistresses",
				"subcultureBdsm"
			],
			"username": "Maddie_Boleyn",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 862.75,
			"token": "c7552bc35024875ecf4833783d13cd95"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/9120293",
			"id": 9120293,
			"country": "cz",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/6\/5\/3\/6533d3fe6b122a2c46ce28dff5d752e1-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"female",
				"ageMilf",
				"ethnicityWhite",
				"hairColorBrown",
				"privatePriceSixteenToTwentyFour",
				"autoTagInteractiveToy",
				"doDance",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doOhmibod",
				"autoTagLovense",
				"doAnal",
				"doSquirt",
				"doCreamPie",
				"doDeepThroat",
				"doFingering",
				"doFisting",
				"doDoggyStyle",
				"doAnalBeads",
				"tagLanguageGerman",
				"specificsHairy"
			],
			"username": "JanetteSims",
			"languages": [
				"en",
				"cs",
				"ru",
				"de"
			],
			"stripScore": 907.5,
			"token": "a0b23487600696dbf43b9eeed5affdbe"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/8827526",
			"id": 8827526,
			"country": "lv",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/a\/e\/1aea7de03f6d3dc3d95338e2caaa0ae4-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"autoTagInteractiveToy",
				"doTalk",
				"doTopless",
				"doNonNude",
				"doPlayGames",
				"doRolePlay",
				"doSexToys",
				"autoTagLovense",
				"doAnal",
				"doBlowjob",
				"doFootFetish",
				"doDeepThroat",
				"doStriptease",
				"doSmoking",
				"tagLanguageFrench",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsTattoos",
				"specificShaven",
				"subcultureHousewives"
			],
			"username": "MadisonGute",
			"languages": [
				"en",
				"fr",
				"de"
			],
			"stripScore": 536.5,
			"token": "33322d093d8fb4fbcba7b148dbf95405"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1538159953\/7321263",
			"id": 7321263,
			"country": "pl",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/0\/6\/106b34d3d0a40656e32f76f85b713c1e-full",
			"broadcastGender": "female",
			"snapshotServer": "eu6",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBrown",
				"privatePriceSixteenToTwentyFour",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doTwerk",
				"doFootFetish",
				"doStriptease",
				"doFingering",
				"tagLanguageGerman",
				"specificSmallTits",
				"specificShaven",
				"subcultureStudent"
			],
			"username": "MollyDoll",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 600.25,
			"token": "73bc91544d69714b29c73b7695c59e6d"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu8\/previews\/1538159949\/7910795",
			"id": 7910795,
			"country": "by",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/b\/5\/8\/b58ce84e0f94233321ff3e8e2e32e39a-full",
			"broadcastGender": "female",
			"snapshotServer": "eu8",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypeAthletic",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceThirtyTwoSixty",
				"autoTagInteractiveToy",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doSexToys",
				"autoTagLovense",
				"doAnal",
				"doSquirt",
				"doAnalPlug",
				"doDildo",
				"doNippleToys",
				"doFingering",
				"doFisting",
				"specificsPiercing",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsTattoos",
				"specificSmallTits",
				"specificShaven",
				"subcultureRomantic"
			],
			"username": "vitalinathepregnancy",
			"languages": [
				"en",
				"ru",
				"de"
			],
			"stripScore": 830.5,
			"token": "9199c823db5fc48e34027d69550a33b6"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/7316143",
			"id": 7316143,
			"country": "it",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/f\/e\/5\/fe50138f8b5fe3cc8f3fc29b500bb808-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBlack",
				"privatePriceSixteenToTwentyFour",
				"doPlayGames",
				"doSexToys",
				"doOhmibod",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"doFootFetish",
				"doAnalPlug",
				"doDildo",
				"doDeepThroat",
				"doStriptease",
				"doFingering",
				"doDoggyStyle",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsTattoos",
				"subcultureGlamour"
			],
			"username": "BiancaCruzzz",
			"languages": [
				"en",
				"it",
				"de"
			],
			"stripScore": 659.5,
			"token": "4c7f919cda9d99f5480de08a5afee746"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1538159956\/8990857",
			"id": 8990857,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/a\/7\/6\/a76ec8c6a34bb3cf53cc4864978240fb-full",
			"broadcastGender": "female",
			"snapshotServer": "eu7",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTwenties",
				"bodyTypeCurvy",
				"hairColorBrown",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doShower",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"doFootFetish",
				"specificsPiercing",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsTattoos",
				"subcultureStudent"
			],
			"username": "Molly_Hot",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 822.5,
			"token": "bc1b5180c9e6b1a6f00bd1cb51baf495"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu4\/previews\/1538159957\/3742402",
			"id": 3742402,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/7\/3\/1730fddb09b73e50f2202e09b604e96b-full",
			"broadcastGender": "female",
			"snapshotServer": "eu4",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypeAthletic",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doTalk",
				"doYoga",
				"doTopless",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doOhmibod",
				"doSquirt",
				"doBlowjob",
				"doFootFetish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsTattoos",
				"subcultureRomantic"
			],
			"username": "AlyceKisss",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 811.5,
			"token": "bda223b6cf216d711e5341ed64952098"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1538159965\/2833265",
			"id": 2833265,
			"country": "kz",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/3\/1\/5\/315134f49127c06e40b6b5d3022b6b3b-full",
			"broadcastGender": "female",
			"snapshotServer": "eu5",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypePetite",
				"ethnicityAsian",
				"hairColorBlack",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doShower",
				"doTalk",
				"doPlayGames",
				"doSexToys",
				"doOil",
				"doOhmibod",
				"doAnal",
				"doSquirt",
				"doBlowjob",
				"doFootFetish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificsHairy",
				"specificsTattoos"
			],
			"username": "brooke_synnn666",
			"languages": [
				"en",
				"ro",
				"de",
				"ru"
			],
			"stripScore": 623.25,
			"token": "686285d69a85a4f4f0177e3872b9479e"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1538159965\/11234",
			"id": 11234,
			"country": "fr",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/7\/2\/e\/72e1c67a91a0d1c2412ac2b0c99738bc-full",
			"broadcastGender": "female",
			"snapshotServer": "eu5",
			"tags": [
				"autoTagPopular",
				"female",
				"ageOld",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doPlayGames",
				"doStriptease",
				"doFingering",
				"doDoggyStyle",
				"tagLanguageFrench",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"subcultureRomantic"
			],
			"username": "MatureExtasy",
			"languages": [
				"en",
				"de",
				"fr",
				"it"
			],
			"stripScore": 569.75,
			"token": "7c09c7d7a49085ef763ad40f3b0e13be"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu5\/previews\/1538159965\/9333746",
			"id": 9333746,
			"country": "kr",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/a\/0\/d\/a0ddba9d6aedaed06707686e671ccef8-full",
			"broadcastGender": "female",
			"snapshotServer": "eu5",
			"tags": [
				"autoTagPopular",
				"autoTagNew",
				"female",
				"ageTeen",
				"bodyTypePetite",
				"ethnicityAsian",
				"privatePriceThirtyTwoSixty",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doTwerk",
				"doSexToys",
				"doOil",
				"doAnal",
				"doBlowjob",
				"doDeepThroat",
				"doFingering",
				"doDoggyStyle",
				"tagLanguageGerman"
			],
			"username": "nature_ju",
			"languages": [
				"en",
				"ja",
				"de"
			],
			"stripScore": 944.75,
			"token": "901e3ef7d2f23428eaf8fc0cb26da505"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/9452939",
			"id": 9452939,
			"country": "us",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/7\/a\/0\/7a0c99c7047f3876051c8ad4333a7453-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"autoTagNew",
				"female",
				"ageTeen",
				"bodyTypeCurvy",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doTopless",
				"doNonNude",
				"doPlayGames",
				"doFootFetish",
				"doTittyFuck",
				"doStriptease",
				"doFingering",
				"tagLanguageFrench",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits"
			],
			"username": "dollyboo",
			"languages": [
				"en",
				"de",
				"fr"
			],
			"stripScore": 942.25,
			"token": "28f3280ad7726257bfdeec4638006588"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu7\/previews\/1538159956\/4308414",
			"id": 4308414,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/f\/0\/0\/f00ab04b20d7ca5af2997a771bb63d61-full",
			"broadcastGender": "female",
			"snapshotServer": "eu7",
			"tags": [
				"autoTagPopular",
				"female",
				"ageOld",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doTalk",
				"doPlayGames",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits"
			],
			"username": "magic_terry",
			"languages": [
				"en",
				"de"
			],
			"stripScore": 774,
			"token": "3b9957cfc847b7e37d24296dca5ae07b"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu6\/previews\/1538159953\/9470049",
			"id": 9470049,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/1\/c\/f\/1cf209f11b4a8e3322d77987bc13c79d-full",
			"broadcastGender": "female",
			"snapshotServer": "eu6",
			"tags": [
				"autoTagPopular",
				"autoTagNew",
				"female",
				"ageTwenties",
				"ethnicityWhite",
				"hairColorBlonde",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doOil",
				"doBlowjob",
				"doNippleToys",
				"specificPregnant",
				"tagLanguageGerman",
				"specificsBigTits"
			],
			"username": "KSANA_G",
			"languages": [
				"en"
			],
			"stripScore": 836,
			"token": "b978c02b2279232ceb8a2550db6f1af0"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu1\/previews\/1538159943\/8267660",
			"id": 8267660,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/c\/5\/8\/c58aeca92020a881fadda5bf962b7e88-full",
			"broadcastGender": "female",
			"snapshotServer": "eu1",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypeCurvy",
				"ethnicityWhite",
				"hairColorRed",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doYoga",
				"doTopless",
				"doPlayGames",
				"doTwerk",
				"doRolePlay",
				"doOffice",
				"doSexToys",
				"doFootFetish",
				"doStriptease",
				"doFingering",
				"doVaping",
				"specificsPiercing",
				"tagLanguageFrench",
				"tagLanguageSpanish",
				"tagLanguageGerman",
				"specificsBigAss",
				"specificsBigTits",
				"specificShaven",
				"subcultureHousewives"
			],
			"username": "Samanta_Lux",
			"languages": [
				"en",
				"de",
				"fr",
				"es"
			],
			"stripScore": 649.25,
			"token": "abbc404efe3f37176bd19cb38c40d6a7"
		},
		{
			"snapshotUrl": "https:\/\/img-eu.stripcdn.com\/eu3\/previews\/1538159950\/5890100",
			"id": 5890100,
			"country": "de",
			"gender": "female",
			"previewUrl": "https:\/\/st.stripcdn.com\/cdn\/previews\/4\/5\/b\/45b7fd18ba5a0c4b3ad5f73092ba4400-full",
			"broadcastGender": "female",
			"snapshotServer": "eu3",
			"tags": [
				"autoTagPopular",
				"female",
				"ageTeen",
				"bodyTypePetite",
				"ethnicityWhite",
				"hairColorBrown",
				"privatePriceSixteenToTwentyFour",
				"doDance",
				"doTalk",
				"doTopless",
				"doPlayGames",
				"doOffice",
				"doStriptease",
				"doFingering",
				"tagLanguageGerman"
			],
			"username": "LilaSexy",
			"languages": [
				"en"
			],
			"stripScore": 607.75,
			"token": "cdeedabea74b80a13fb20df9ba2f000f"
		}
	],
	"camsDataTagName": "German",
	"downloadVRApp": false,
	"mlVideoRelated": {
		"is_ml_related": true,
		"is_sponsor": false,
		"categories": [
			{
				"name": "Deutsch",
				"url": "\/categories\/german",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "132"
			},
			{
				"name": "Pissen",
				"url": "\/categories\/pissing",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "42181"
			},
			{
				"name": "Vintage",
				"url": "\/categories\/vintage",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "51"
			},
			{
				"name": "Maximum",
				"url": "\/tags\/maximum",
				"sponsor-tag": false,
				"pornstar": false,
				"id": "5402"
			}
		]
	},
	"userComment": null,
	"gaSettings": {
		"events": [],
		"dimensions": {
			"dimension5": "straight",
			"dimension10": false,
			"dimension2": "XH New Design",
			"dimension6": "standard",
			"orientation": {}
		},
		"sampling": 25,
		"trackerId": "UA-23892695-1",
		"amp": true,
		"fields": {
			"anonymizeIp": true
		}
	},
	"staticURL": "https:\/\/static-cl.xhcdn.com\/xh-tpl3",
	"trustURLs": [
		"xhamsterlive.com",
		"xhamsterpremium.com",
		"stripchat.com",
		"xhamster.com"
	],
	"recaptchaKey": "6LeRuQYTAAAAAIIJzu4QOt24eoVgxL0Ff8a1g-vA",
	"isComeFromAmp": false,
	"userGender": null,
	"isDesktopSite": true,
	"bannerPrefix": "wid-",
	"orientation": "straight",
	"isDesktop": true,
	"promo": "",
	"frontStats": false
}

    """.trimIndent()
    )

    @Test
    fun testParseJsonString1() {
        val videoModel = VideoModelParser().fromString(jsonString[0])
        Assert.assertNotNull(videoModel)
    }

    @Test
    fun testParseJsonString2() {
        val videoModel = VideoModelParser().fromString(jsonString[1])
        Assert.assertNotNull(videoModel)
    }
}