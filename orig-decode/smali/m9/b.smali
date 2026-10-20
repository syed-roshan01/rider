.class public final Lm9/b;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/v1;


# static fields
.field public static final a:Lm9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm9/b;->a:Lm9/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Active"

    return-object v0
.end method
