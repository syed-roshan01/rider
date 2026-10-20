.class public abstract Lk0/s0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lb/۠ۨۦۥ;->۠ۥۦۣ()Lk0/j0;

    move-result-object v0

    new-instance v1, Lm0/p0;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟۟۟ۨ()Lm0/o3;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lm0/p0;-><init>(Lm0/z2;Lc9/a;)V

    sput-object v1, Lk0/s0;->a:Lm0/p0;

    return-void
.end method
