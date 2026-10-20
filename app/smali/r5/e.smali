.class public abstract Lr5/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ll5/o;

.field public static final b:Ll5/o;

.field public static final c:Ll5/o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ll5/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll5/o;-><init>(I)V

    sput-object v0, Lr5/e;->a:Ll5/o;

    new-instance v0, Ll5/o;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll5/o;-><init>(I)V

    sput-object v0, Lr5/e;->b:Ll5/o;

    new-instance v0, Ll5/o;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll5/o;-><init>(I)V

    sput-object v0, Lr5/e;->c:Ll5/o;

    return-void
.end method
