.class public final Ls4/l;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ls4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls4/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls4/l;->a:Ls4/l;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "coil.request.NullRequestData"

    return-object v0
.end method
