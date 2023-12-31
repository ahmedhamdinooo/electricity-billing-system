/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2014 (12.0.2269)
    Source Database Engine Edition : Microsoft SQL Server Express Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2017
    Target Database Engine Edition : Microsoft SQL Server Standard Edition
    Target Database Engine Type : Standalone SQL Server
*/
USE [master]
GO
/****** Object:  Database [Electricity_Billing_System]    Script Date: 3/13/2021 6:50:05 PM ******/
CREATE DATABASE [Electricity_Billing_System]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Electricity_Billing_System', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\Electricity_Billing_System.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Electricity_Billing_System_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\Electricity_Billing_System_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Electricity_Billing_System] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Electricity_Billing_System].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Electricity_Billing_System] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET ARITHABORT OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Electricity_Billing_System] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Electricity_Billing_System] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Electricity_Billing_System] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Electricity_Billing_System] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Electricity_Billing_System] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Electricity_Billing_System] SET  MULTI_USER 
GO
ALTER DATABASE [Electricity_Billing_System] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Electricity_Billing_System] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Electricity_Billing_System] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Electricity_Billing_System] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [Electricity_Billing_System] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Electricity_Billing_System]
GO
/****** Object:  Table [dbo].[Center]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Center](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Center_Name] [nvarchar](200) NULL,
	[GovID] [int] NULL,
 CONSTRAINT [PK_Center] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Complains]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Complains](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Title] [nvarchar](200) NULL,
	[Body] [nvarchar](500) NULL,
	[UserID] [int] NULL,
	[CreationDate] [datetime] NULL,
	[CreatedBy] [int] NULL,
 CONSTRAINT [PK_Complains] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](200) NULL,
	[user_name] [nvarchar](100) NULL,
	[Address] [nvarchar](500) NULL,
	[Attach_File] [nvarchar](200) NULL,
	[Mobile] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Region_ID] [int] NULL,
	[Creation_Date] [datetime] NULL,
	[Created_By] [int] NULL,
	[passWord] [nvarchar](50) NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Government]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Government](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Gov_Name] [nvarchar](200) NULL,
 CONSTRAINT [PK_Government] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Meter]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Meter](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Customer_ID] [int] NULL,
	[Meter_Code] [nvarchar](200) NULL,
	[IsActive] [bit] NULL,
	[Created_by] [int] NULL,
	[Creation_Date] [datetime] NULL,
 CONSTRAINT [PK_Meter] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Meter_Payment]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Meter_Payment](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Meter_Reading_ID] [int] NULL,
	[Invoice_Value] [float] NULL,
	[Paid] [bit] NULL,
	[Paid_Date] [datetime] NULL,
 CONSTRAINT [PK_Meter_Payment] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Meter_Reading]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Meter_Reading](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Meter_ID] [int] NULL,
	[Reading] [float] NULL,
	[Reading_date] [datetime] NULL,
	[Entered_By_Customer] [bit] NULL,
	[Entered_By_Operator] [bit] NULL,
	[Status] [int] NULL,
	[User_ID] [int] NULL,
 CONSTRAINT [PK_Meter_Reading] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[operatoer]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[operatoer](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](10) NULL,
	[password] [nvarchar](20) NULL,
	[name] [nvarchar](20) NULL,
	[address] [nvarchar](20) NULL,
	[phone] [nvarchar](20) NULL,
	[salary] [float] NULL,
 CONSTRAINT [PK__operatoe__3213E83F77A111CD] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Region]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Region](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Region_Name] [nvarchar](200) NULL,
	[Center_ID] [int] NULL,
 CONSTRAINT [PK_Region] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[users]    Script Date: 3/13/2021 6:50:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[user_name] [nvarchar](50) NULL,
	[pass_word] [nvarchar](50) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Customer] ON 

INSERT [dbo].[Customer] ([ID], [Name], [user_name], [Address], [Attach_File], [Mobile], [Phone], [Region_ID], [Creation_Date], [Created_By], [passWord]) VALUES (1, NULL, N'heba', NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'h123')
SET IDENTITY_INSERT [dbo].[Customer] OFF
SET IDENTITY_INSERT [dbo].[Meter_Reading] ON 

INSERT [dbo].[Meter_Reading] ([ID], [Meter_ID], [Reading], [Reading_date], [Entered_By_Customer], [Entered_By_Operator], [Status], [User_ID]) VALUES (1, 123, 555, NULL, NULL, NULL, NULL, 1)
SET IDENTITY_INSERT [dbo].[Meter_Reading] OFF
INSERT [dbo].[users] ([user_name], [pass_word]) VALUES (N'heba', N'123')
INSERT [dbo].[users] ([user_name], [pass_word]) VALUES (N'samah', N'123')
ALTER TABLE [dbo].[Meter_Reading]  WITH CHECK ADD  CONSTRAINT [FK_Meter_Reading_Meter_Reading] FOREIGN KEY([ID])
REFERENCES [dbo].[Meter_Reading] ([ID])
GO
ALTER TABLE [dbo].[Meter_Reading] CHECK CONSTRAINT [FK_Meter_Reading_Meter_Reading]
GO
USE [master]
GO
ALTER DATABASE [Electricity_Billing_System] SET  READ_WRITE 
GO
