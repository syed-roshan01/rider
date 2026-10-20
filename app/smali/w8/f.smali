.class public abstract Lw8/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lga/i;

.field public static b:Lga/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lga/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lga/i;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, Lw8/f;->a:Lga/i;

    return-void
.end method
