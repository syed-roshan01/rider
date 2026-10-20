.class public final Le6/c;
.super Ljava/lang/Object;

# interfaces
.implements Le6/b;


# static fields
.field public static final a:Le6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le6/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le6/c;->a:Le6/c;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
