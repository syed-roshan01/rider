.class public abstract Lt5/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ll5/o;

.field public static final b:Ll5/o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ll5/o;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll5/o;-><init>(I)V

    sput-object v0, Lt5/b;->a:Ll5/o;

    new-instance v0, Ll5/o;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll5/o;-><init>(I)V

    sput-object v0, Lt5/b;->b:Ll5/o;

    return-void
.end method
