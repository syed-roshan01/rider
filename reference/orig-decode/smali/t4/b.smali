.class public final Lt4/b;
.super Lf6/a;


# static fields
.field public static final z:Lt4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt4/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt4/b;->z:Lt4/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dimension.Undefined"

    return-object v0
.end method
